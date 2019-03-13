package cn.facebank.common.curator;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class CuratorManager {

    private CuratorProperties curatorProperties ;

    public CuratorManager(CuratorProperties curatorProperties) {
        this.curatorProperties = curatorProperties;
    }

    public CuratorFramework connect(){

        return CuratorFrameworkFactory.builder()
                .connectString(curatorProperties.getAddress())
                .sessionTimeoutMs(curatorProperties.getSessionTimeOutMs())
                .retryPolicy(new ExponentialBackoffRetry(curatorProperties.getSleepMsBetweenRetris(), curatorProperties.getRetryCount()))
                .namespace(curatorProperties.getNamespace())
                .build();
    }
}
