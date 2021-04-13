package top.zhuqq.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.zhuqq.service.DemoService;

/**
 * project-name : double-patent.
 * class-name : DemoService.
 *
 * @author : Zqq.
 * date : 2021/4/12.
 * time : 23:02.
 */
@DubboService
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public void demo() {
        System.out.println("hahahh");
    }
}
