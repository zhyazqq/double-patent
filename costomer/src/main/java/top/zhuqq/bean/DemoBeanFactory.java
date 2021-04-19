package top.zhuqq.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * project-name : double-patent.
 * class-name : DemoBeanFactory.
 *
 * @author : Zqq.
 * date : 2021/4/19.
 * time : 22:49.
 * 感知类demo
 */
public class DemoBeanFactory implements BeanFactoryAware , BeanPostProcessor {
    private BeanFactory beanFactory;
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }
        //后置处理器的用法
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //功能增强
        if(bean instanceof UserFactoryBean){
               //todo 业务逻辑
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
