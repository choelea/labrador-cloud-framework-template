package tech.icoding.service.demo.sdk.cloud.config;

import tech.icoding.service.demo.sdk.cloud.client.DemoFeign;
import tech.icoding.service.demo.sdk.cloud.service.FeignTestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * feign service配置类示例
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Configuration
public class FeignServiceConfig {

    @Resource
    private DemoFeign demoFeign;

    @Bean(value = "feignTestService")
    public FeignTestService feignTestService(){
        FeignTestService feignTestService = new FeignTestService();
        feignTestService.setDemoFeign(demoFeign);
        return feignTestService;
    }

}
