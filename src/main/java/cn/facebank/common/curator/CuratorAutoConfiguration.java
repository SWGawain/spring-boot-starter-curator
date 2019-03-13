package cn.facebank.common.curator;

import org.apache.curator.framework.CuratorFrameworkFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author SWGawain
 */
@Configuration
@ConditionalOnMissingBean({CuratorFrameworkFactory.class,CuratorManager.class})
@EnableConfigurationProperties(CuratorProperties.class)
public class CuratorAutoConfiguration implements BeanFactoryAware {

    private BeanFactory beanFactory ;

    @Bean
    public CuratorManager createManager(){
        CuratorProperties properties = beanFactory.getBean(CuratorProperties.class);
        return new CuratorManager(properties);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory ;
    }
}
