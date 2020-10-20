package tech.icoding.service.demo.sdk.http.req;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 入参基类
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Data
@ApiModel(description = "入参基类")
public class BaseReqDto implements Serializable {
    private static final long serialVersionUID = 5285609503988153285L;
    private String id;
}
