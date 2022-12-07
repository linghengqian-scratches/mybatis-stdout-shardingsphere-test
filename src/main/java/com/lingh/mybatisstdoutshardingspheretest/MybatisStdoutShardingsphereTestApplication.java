package com.lingh.mybatisstdoutshardingspheretest;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@MapperScan("com.lingh.mybatisstdoutshardingspheretest")
public class MybatisStdoutShardingsphereTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisStdoutShardingsphereTestApplication.class, args);
    }
}

record TOrderPO(String idString, LocalDateTime createTime) {
}

@SuppressWarnings({"SqlResolve", "SqlNoDataSourceInspection"})
@Mapper
interface TOrderMapper {
    @Select("""
            select ANY_VALUE(`id_string`) as id_string, ANY_VALUE(`create_time`) as create_time
            from t_order
            where `create_time` between '2022-11-24 00:00:00.000' and '2022-11-25 00:00:00.000'
            group by (unix_timestamp(`create_time`) div 3600)
            order by `create_time`
            limit 30
            """)
    List<TOrderPO> findByLogicTable();

    @Select("""
            select ANY_VALUE(`id_string`) as id_string, ANY_VALUE(`create_time`) as create_time
             from t_order_20221124
             where `create_time` between '2022-11-24 00:00:00.000' and '2022-11-25 00:00:00.000'
             group by (unix_timestamp(`create_time`) div 3600)
             order by `create_time`
             limit 30
             """)
    List<TOrderPO> findByActualTable();
}
