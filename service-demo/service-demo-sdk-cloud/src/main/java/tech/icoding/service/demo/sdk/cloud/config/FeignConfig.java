package tech.icoding.service.demo.sdk.cloud.config;

import feign.Feign;
import feign.Retryer;
import feign.querymap.BeanQueryMapEncoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign配置类
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Configuration
@EnableFeignClients(basePackages = {"tech.icoding.service.demo.sdk.cloud.client"})
public class FeignConfig {

    /**
     * 替换解析queryMap的类，实现父类中变量的映射
     * Bean的name一定要全局唯一
     *
     * @return
     */
    @Bean(name = "service-demo-feignBuilder")
    public Feign.Builder feignBuilder() {
        return Feign.builder()
                .queryMapEncoder(new BeanQueryMapEncoder())
                .retryer(Retryer.NEVER_RETRY);
    }

}
