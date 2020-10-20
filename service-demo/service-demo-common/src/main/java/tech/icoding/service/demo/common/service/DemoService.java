package tech.icoding.service.demo.common.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import tech.icoding.service.demo.common.mapper.DemoMapper;
import tech.icoding.service.demo.common.model.DemoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 测试service
 *
 * @author Joe Li
 * @email joe.lea@foxmail.com
 * @date 2020-10-20
 */
@Service
@Slf4j
public class DemoService extends ServiceImpl<DemoMapper, DemoEntity> {

    @Resource
    private DemoMapper testMapper;

}
