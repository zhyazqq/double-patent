package top.zhuqq.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import top.zhuqq.entity.User;

/**
 * project-name : double-patent.
 * class-name : UserFactoryBean.
 *
 * @author : Zqq.
 * date : 2021/4/14.
 * time : 22:43.
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() {

        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
