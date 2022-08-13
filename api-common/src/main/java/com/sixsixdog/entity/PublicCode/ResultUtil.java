package com.sixsixdog.entity.PublicCode;


import com.sixsixdog.entity.Result;

public class ResultUtil {

    public static Result<Object> success(Object object) {
        Result<Object> result = new Result<Object>();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result<Object> build(int code, Object data) {
        Result<Object> result = new Result<Object>();
        result.setCode(code);
        if (code==200)
            result.setMsg("成功");
        else
            result.setMsg("");
        result.setData(data);
        return result;
    }

    public static Result<Object> build(int code,String msg, Object data) {
        Result<Object> result = new Result<Object>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result<Object> success() {
        return success(null);
    }
    // 未找到服务
    public static Result<Object> error500(String msg) {
        Result<Object> result = new Result<Object>();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }

    // 数据格式不正确
    public static Result<Object> error415(String msg) {
        Result<Object> result = new Result<Object>();
        result.setCode(415);
        result.setMsg(msg);
        return result;
    }

    public static Result<Object> error400(String msg) {
        Result<Object> result = new Result<Object>();
        result.setCode(400);
        result.setMsg(msg);
        return result;
    }
}
