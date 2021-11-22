package tech.wys.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.wys.rpc.api.HelloObject;
import tech.wys.rpc.api.HelloService;

public class HelloServiceImpl2 implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl2.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到消息：{}", object.getMessage());
        return "本次处理来自Socket服务";
    }
}