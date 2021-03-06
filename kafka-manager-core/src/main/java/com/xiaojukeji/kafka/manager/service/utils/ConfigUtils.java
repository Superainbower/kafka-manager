package com.xiaojukeji.kafka.manager.service.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author zengqiao
 * @date 20/4/26
 */
@Service("configUtils")
public class ConfigUtils {
    @Value(value = "${custom.idc}")
    private String idc;

    @Value("${custom.jmx.max-conn}")
    private Integer jmxMaxConn;

    @Value(value = "${spring.profiles.active}")
    private String kafkaManagerEnv;

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public Integer getJmxMaxConn() {
        return jmxMaxConn;
    }

    public void setJmxMaxConn(Integer jmxMaxConn) {
        this.jmxMaxConn = jmxMaxConn;
    }

    public String getKafkaManagerEnv() {
        return kafkaManagerEnv;
    }

    public void setKafkaManagerEnv(String kafkaManagerEnv) {
        this.kafkaManagerEnv = kafkaManagerEnv;
    }
}
