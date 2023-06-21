package com.short_term.crm.tools;

public class CommonResult <T>{
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private T result;
    private int statusCode;
    private String msg;

    public CommonResult(T result){
        this.result = result;
        msg = "ok";
        statusCode = 200;
    }

    public CommonResult(T result, int stateCode){
        this.result = result;
        msg = "ok";
        this.statusCode = stateCode;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "result=" + result +
                ", stateCode='" + statusCode + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
