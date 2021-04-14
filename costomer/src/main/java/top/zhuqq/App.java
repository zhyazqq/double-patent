package top.zhuqq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.zhuqq.bean.UserFactoryBean;
import top.zhuqq.entity.User;

/**
 * project-name : double-patent.
 * class-name : App.
 *
 * @author : Zqq.
 * date : 2021/4/13.
 * time : 22:22.
 */
@EnableDubbo(scanBasePackages = "top.zhuqq.service")
// scanBasePackages扫描生产者包
@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
//        UserFactoryBean userFactoryBean = new UserFactoryBean();
//        userFactoryBean.setUserInfo("张三,53,qwerr");
//        User object = userFactoryBean.getObject();
//        System.out.println(object);
        SpringApplication.run(App.class,args);
    }
}
