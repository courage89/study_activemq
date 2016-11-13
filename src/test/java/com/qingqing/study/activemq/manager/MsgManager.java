package com.qingqing.study.activemq.manager;

import com.qingqing.study.activemq.TestBase;
import com.qingqing.study.activemq.producer.SimpleMessageProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.JMSException;
import java.util.concurrent.TimeUnit;

/**
 * Created by xuya on 2016/11/13.
 */
public class MsgManager extends TestBase {

    @Autowired
    private SimpleMessageProducer simpleMessageProducer;

    @Test
    public void testSendMsg() throws InterruptedException, JMSException {

        simpleMessageProducer.sendMessages();

        TimeUnit.SECONDS.sleep(10);
    }

}
