package com.lingh.mybatisstdoutshardingspheretest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MybatisStdoutShardingsphereTestApplicationTests {
    @Autowired
    TOrderMapper tOrderMapper;

    @Test
    void testLogicTableWithoutGroup() {
        List<TOrderPO> tOrderPOS = List.of(
                new TOrderPO("114515", LocalDateTime.of(2022, 11, 24, 0, 0, 0)),
                new TOrderPO("114516", LocalDateTime.of(2022, 11, 25, 0, 0, 0))
        );
        assertThat(tOrderMapper.findByLogicTable()).isEqualTo(tOrderPOS);
    }

    @Test
    void testActualTable() {
        List<TOrderPO> tOrderPOS = List.of(new TOrderPO("114515", LocalDateTime.of(2022, 11, 24, 0, 0, 0)));
        assertThat(tOrderMapper.findByActualTable()).isEqualTo(tOrderPOS);
    }
}
