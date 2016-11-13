package com.qingqing.study.activemq.listener;

import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by xuya on 2016/11/12.
 */
public class SpringMessageListener implements SessionAwareMessageListener {

    public void onMessage(Message message, Session session) throws JMSException {

// This is a Spring-specific interface the provides access to the JMS session object.
// This is very useful for request-response messaging.
// Just be aware that you must do your own exception handling
// (i.e., override the handleListenerException method so exceptions are not lost).
    }
}
