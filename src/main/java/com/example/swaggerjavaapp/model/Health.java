package com.example.swaggerjavaapp.model;

import org.springframework.http.HttpStatus;

public class Health {
    private String msg;
    private HttpStatus status;

    public Health(String msg, HttpStatus status){
        this.setMsg(msg);
        this.setStatus(status);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Health(){}

}
