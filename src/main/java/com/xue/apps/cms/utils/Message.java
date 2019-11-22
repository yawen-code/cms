package com.xue.apps.cms.utils;

public class Message <T> {
    private Integer status;//状态码 200 500
    private String message;//信息
    private T data;//可以用泛型；操作（查询）结果
    private Long timestamp;//时间戳

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
