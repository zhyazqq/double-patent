package top.zhuqq.cosumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhuqq.service.DemoService;

/**
 * project-name : double-patent.
 * class-name : DemoController.
 *
 * @author : Zqq.
 * date : 2021/4/12.
 * time : 23:29.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Reference
    private DemoService demoService;
    @RequestMapping("/test")
    public String demo(){
        demoService.demo();
        return "success";
    }
}
