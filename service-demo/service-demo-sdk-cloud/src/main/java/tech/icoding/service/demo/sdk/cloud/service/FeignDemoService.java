package tech.icoding.service.demo.sdk.cloud.service;

import com.alibaba.fastjson.JSON;
import lombok.Setter;
import tech.icoding.service.demo.sdk.cloud.client.DemoFeign;
import tech.icoding.service.demo.sdk.http.req.BaseReqDto;
import tech.icoding.service.demo.sdk.http.resp.BaseRespDto;
import lombok.Data;
import net.bestjoy.cloud.core.bean.Result;


/**
 * feign service示例
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
public class FeignDemoService {

    @Setter
    private DemoFeign demoFeign;

    public BaseRespDto demoGet(BaseReqDto reqDto){
        Result result = demoFeign.get(reqDto);
        //异常处理
        result.checkErrorResponse();
        //返回体转换
        return JSON.parseObject(JSON.toJSONString(result.getResult()),BaseRespDto.class);
    }

    public BaseRespDto demoPost(BaseReqDto reqDto){
        Result result = demoFeign.post(reqDto);
        //异常处理
        result.checkErrorResponse();
        //返回体转换
        return JSON.parseObject(JSON.toJSONString(result.getResult()),BaseRespDto.class);
    }

}
