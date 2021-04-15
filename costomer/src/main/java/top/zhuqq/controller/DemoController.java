package top.zhuqq.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhuqq.bean.UserFactoryBean;
import top.zhuqq.entity.User;
import top.zhuqq.service.DemoService;

import javax.annotation.Nullable;
import javax.annotation.Resource;

/**
 * project-name : double-patent.
 * class-name : DemoController.
 *
 * @author : Zqq.
 * date : 2021/4/13.
 * time : 22:23.
 */
 @RestController
 @RequestMapping("/test")
public class DemoController implements BeanFactoryAware {

     private BeanFactory beanFactory;
     @DubboReference(interfaceClass =DemoService.class )
     private DemoService service;
     @RequestMapping("/demo")
    public String getService() throws Exception {
         User user = (User)beanFactory.getBean("userFactoryBean");
         UserFactoryBean user1 = (UserFactoryBean)beanFactory.getBean("&userFactoryBean");
         System.out.println(user+"++"+user1);
         service.demo();
        return "service";
    }

    @Override

    public void setBeanFactory(@Nullable BeanFactory beanFactory) throws BeansException {
     this.beanFactory=beanFactory;
    }
}
