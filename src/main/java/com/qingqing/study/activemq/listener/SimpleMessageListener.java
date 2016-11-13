package com.qingqing.study.activemq.listener;

import com.qingqing.study.activemq.domain.MsgDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.support.converter.MessageConverter;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by xuya on 2016/11/12.
 */
public class SimpleMessageListener implements MessageListener {

    public static final Logger logger = LoggerFactory.getLogger(SimpleMessageListener.class);

    //    private MappingJackson2MessageConverter messageConverter;
    private MessageConverter messageConverter;

    public void onMessage(Message message) {

        MsgDemo msg = null;
        try {
            msg = (MsgDemo) messageConverter.fromMessage(message);
        } catch (JMSException e) {
            e.printStackTrace();
        }

        logger.info("msg on receiving:" + (msg == null ? null : msg.toString()));
    }

    public void setMessageConverter(MessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    //    public void setMessageConverter(MappingJackson2MessageConverter messageConverter) {
//        this.messageConverter = messageConverter;
//    }
}
