package com.yejinhui.shardingjdbcmasterslavetables;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinhui.ye@ucarinc.com
 * @date 2019/06/29
 */
@SpringBootApplication
@MapperScan(value = {"com.yejinhui.shardingjdbcmasterslavetables.mapper"})
public class ShardingJdbcMasterSlaveTablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcMasterSlaveTablesApplication.class, args);
    }

}
