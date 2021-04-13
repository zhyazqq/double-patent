package top.zhuqq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
