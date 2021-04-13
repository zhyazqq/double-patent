package top.zhuqq.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhuqq.service.DemoService;

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
public class DemoController {
     @DubboReference(interfaceClass =DemoService.class )
     private DemoService service;
     @RequestMapping("/demo")
    public String getService() {
              service.demo();
        return "service";
    }
}
