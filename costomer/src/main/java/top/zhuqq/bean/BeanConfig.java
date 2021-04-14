package top.zhuqq.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * project-name : double-patent.
 * class-name : BeanConfig.
 *
 * @author : Zqq.
 * date : 2021/4/14.
 * time : 23:07.
 */
@Component
public class BeanConfig {
    @Bean
    public UserFactoryBean userFactoryBean(){
        return new UserFactoryBean();
    }
}
