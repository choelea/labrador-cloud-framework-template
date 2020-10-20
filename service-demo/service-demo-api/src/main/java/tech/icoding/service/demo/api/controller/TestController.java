package tech.icoding.service.demo.api.controller;

import tech.icoding.service.demo.facade.TestFacade;
import tech.icoding.service.demo.sdk.http.req.BaseReqDto;
import tech.icoding.service.demo.sdk.http.resp.BaseRespDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.bestjoy.cloud.core.bean.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 测试控制器
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Slf4j
@RestController
@Api(tags = "控制器示例")
@RequestMapping(value = "/demo")
public class TestController {

    @Resource
    private TestFacade testFacade;

    @GetMapping(value = "/get")
    @ApiOperation(value = "get请求示例", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET",response = BaseRespDto.class)

    public Result demoGet(@ModelAttribute BaseReqDto reqDto){
        return Result.success(new BaseRespDto());
    }

    @PostMapping(value = "/post")
    @ApiOperation(value = "post请求示例", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, httpMethod = "POST",response = BaseRespDto.class)
    public Result demoPost(@RequestBody BaseReqDto reqDto){
        return Result.success(new BaseRespDto());
    }

}
