package top.zhuqq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * project-name : double-patent.
 * class-name : AppCosumer.
 *
 * @author : Zqq.
 * date : 2021/4/12.
 * time : 23:33.
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "top.zhuqq.cosumer.comtroller")
public class AppCosumer {
    public static void main(String[] args) {
        SpringApplication.run(AppCosumer.class,args);
    }
}
