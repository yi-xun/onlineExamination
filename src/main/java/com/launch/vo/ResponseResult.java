package com.launch.vo;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
public class ResponseResult<T> implements Serializable {

    private boolean ok;

    //状态码，根据服务实际需求自定义
    private int code;

    private String msg;

    private T data;

    public ResponseResult() {
    }

    public ResponseResult(boolean ok, String msg, T data) {
        this.ok = ok;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(boolean ok, int code, String msg) {
        this.ok = ok;
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(boolean ok, int code, String msg, T data) {
        this.ok = ok;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseResult success(String msg) {
        return new ResponseResult<>(true, 200, msg, null);
    }

    public static ResponseResult success(String msg, Object data) {
        return new ResponseResult<>(true, 200, msg, data);
    }


    public static ResponseResult fail(HttpStatus item) {
        return new ResponseResult(false, item.value(), item.getReasonPhrase());
    }

    public static ResponseResult fail(int status, String msg) {
        return new ResponseResult(false, status, msg);
    }

    public static ResponseResult fail(int status, String msg, Object data) {
        return new ResponseResult<>(false, status, msg, data);
    }

}
