package cn.facebank.common.curator;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zookeeper")
public class CuratorProperties {

    private String address = "localhost:2181";
    private Integer retryCount =10;
    private Integer sleepMsBetweenRetris =5000;
    private Integer sessionTimeOutMs = 5000 ;
    private String namespace = "curator";

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Integer getSessionTimeOutMs() {
        return sessionTimeOutMs;
    }

    public void setSessionTimeOutMs(Integer sessionTimeOutMs) {
        this.sessionTimeOutMs = sessionTimeOutMs;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public Integer getSleepMsBetweenRetris() {
        return sleepMsBetweenRetris;
    }

    public void setSleepMsBetweenRetris(Integer sleepMsBetweenRetris) {
        this.sleepMsBetweenRetris = sleepMsBetweenRetris;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
