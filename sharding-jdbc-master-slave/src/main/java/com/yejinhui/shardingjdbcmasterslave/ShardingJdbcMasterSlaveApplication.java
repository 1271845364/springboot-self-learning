package com.yejinhui.shardingjdbcmasterslave;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinhui.ye@ucarinc.com
 * @date 2019/06/29
 */
@SpringBootApplication
@MapperScan(value = {"com.yejinhui.shardingjdbcmasterslave.mapper"})
public class ShardingJdbcMasterSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcMasterSlaveApplication.class, args);
    }

}
