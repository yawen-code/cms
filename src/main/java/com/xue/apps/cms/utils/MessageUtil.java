package com.xue.apps.cms.utils;

import java.util.Date;

public class MessageUtil {
    /**
     * 返回失败消息，一般用于增删改操作的结果返回
     * */
    public static Message<?> error(String msg){
        Message<?> message = new Message<>();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * 返回成功消息，一般用于增删改操作的结果返回
     * */
    public static Message<?> success(String msg){
        Message<?> message = new Message<>();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    /**
     * 返回成功的消息，一般用于查询操作的结果返回
     * */
    public static <T> Message<T> success(String msg,T data){//前面的<T>是指定参数列表的T;Message<T>相当于就是一个类型，这个T是传给Message的T，相当于指定Message的属性data
        Message<T> message = new Message<T>();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    public static<T> Message<T> success(T data){
        Message<T> message = new Message<T>();
        message.setStatus(200);
        message.setMessage("success");
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    
}
