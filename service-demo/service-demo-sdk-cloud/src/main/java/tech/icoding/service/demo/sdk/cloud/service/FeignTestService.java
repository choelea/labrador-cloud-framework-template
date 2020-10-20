package tech.icoding.service.demo.sdk.cloud.service;

import com.alibaba.fastjson.JSON;
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
@Data
public class FeignTestService {

    private DemoFeign demoFeign;

    public BaseRespDto testGet(BaseReqDto reqDto){
        Result result = demoFeign.get(reqDto);
        //异常处理
        result.checkErrorResponse();
        //返回体转换
        return JSON.parseObject(JSON.toJSONString(result.getResult()),BaseRespDto.class);
    }

    public BaseRespDto testPost(BaseReqDto reqDto){
        Result result = demoFeign.post(reqDto);
        //异常处理
        result.checkErrorResponse();
        //返回体转换
        return JSON.parseObject(JSON.toJSONString(result.getResult()),BaseRespDto.class);
    }

}
