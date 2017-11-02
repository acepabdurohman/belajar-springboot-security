package com.acepabdurohman.belajar.belajarspringbootsecurity.util;

import java.util.List;

public class ResponseTemplate<T> {
    private Integer status;
    private String message;
    private Object data;

    public ResponseTemplate(){}

    public ResponseTemplate(Integer status, String message){
        this.status = status;
        this.message = message;
    }

    public ResponseTemplate(Integer status, String message, List<T> list){
        this.status = status;
        this.message = message;
        data = list;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
