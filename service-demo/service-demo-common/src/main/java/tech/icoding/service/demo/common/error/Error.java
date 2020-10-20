package tech.icoding.service.demo.common.error;

import net.bestjoy.cloud.core.error.ErrorCodeAndMessage;

/**
 * 异常常量
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
public interface Error {

    interface Biz{
        ErrorCodeAndMessage RECORDS_NOT_FOUND = ErrorCodeAndMessage.create("000004","记录不存在");
    }

}
