create table IF NOT EXISTS t_order_20221123
(
    `id_string`   varchar(50),
    `create_time` datetime(3),
    PRIMARY KEY (`id_string`)
    );
create table IF NOT EXISTS t_order_20221124
(
    `id_string`   varchar(50),
    `create_time` datetime(3),
    PRIMARY KEY (`id_string`)
    );
create table IF NOT EXISTS t_order_20221125
(
    `id_string`   varchar(50),
    `create_time` datetime(3),
    PRIMARY KEY (`id_string`)
    );
create table IF NOT EXISTS t_order_20221126
(
    `id_string`   varchar(50),
    `create_time` datetime(3),
    PRIMARY KEY (`id_string`)
    );

INSERT INTO t_order_20221123 (`id_string`, `create_time`)
VALUES ('114514', '2022-11-23 00:00:00.000');
INSERT INTO t_order_20221124 (`id_string`, `create_time`)
VALUES ('114515', '2022-11-24 00:00:00.000');
INSERT INTO t_order_20221125 (`id_string`, `create_time`)
VALUES ('114516', '2022-11-25 00:00:00.000');
INSERT INTO t_order_20221126 (`id_string`, `create_time`)
VALUES ('114516', '2022-11-26 00:00:00.000');