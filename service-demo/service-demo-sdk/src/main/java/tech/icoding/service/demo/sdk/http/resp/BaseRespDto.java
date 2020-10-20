package tech.icoding.service.demo.sdk.http.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 返参基类
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Data
@ApiModel(description = "返参基类")
public class BaseRespDto implements Serializable {
    private static final long serialVersionUID = 4789276846959457458L;
    private String id;
    private String text;
}
