package tech.icoding.service.demo.sdk.cloud.client;

import tech.icoding.service.demo.sdk.cloud.config.FeignConfig;
import tech.icoding.service.demo.sdk.http.req.BaseReqDto;
import net.bestjoy.cloud.core.bean.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * test接口feign
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@FeignClient(
        value = "service-demo",
        path = "/service-demo/demo",
        configuration = FeignConfig.class,
        contextId = "service-demo",
        url = "${service-demo.url.remoteUrl:}"
)
public interface DemoFeign {

    @GetMapping(value = "/get")
    Result get(@SpringQueryMap BaseReqDto reqDto);

    @PostMapping(value = "/post")
    Result post(@RequestBody BaseReqDto reqDto);

}
