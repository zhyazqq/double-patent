package top.zhuqq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * project-name : double-patent.
 * class-name : AppProvider.
 *
 * @author : Zqq.
 * date : 2021/4/12.
 * time : 23:24.
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "top.zhuqq.provider.service.impl")
public class AppProvider {
    public static void main(String[] args) {
        SpringApplication.run(AppProvider.class,args);
    }
}
