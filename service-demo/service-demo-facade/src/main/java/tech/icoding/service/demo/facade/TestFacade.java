package tech.icoding.service.demo.facade;

import tech.icoding.service.demo.common.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * test facade
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Service
@Slf4j
public class TestFacade {

    @Resource
    private DemoService demoService;

}
