package com.qingqing.study.activemq.converter;

import org.springframework.jms.support.converter.MarshallingMessageConverter;

/**
 * Created by xuya on 2016/11/13.
 */
public class QQMsgXmlConverter extends MarshallingMessageConverter {

    /**
    *
     * 使用该converter没有调试通过，如下为错误信息
     * Caused by: org.springframework.oxm.UnmarshallingFailureException: Could not create XMLReader for SAXSource; nested exception is org.xml.sax.SAXNotRecognizedException: http://apache.org/xml/features/disallow-doctype-decl
     */

}
