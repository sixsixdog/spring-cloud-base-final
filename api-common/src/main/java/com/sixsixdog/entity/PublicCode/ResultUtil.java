package com.sixsixdog.entity.PublicCode;


import com.sixsixdog.entity.Result;

public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result build(int code, Object data) {
        Result result = new Result();
        result.setCode(code);
        if (code==200)
            result.setMsg("成功");
        else
            result.setMsg("");
        result.setData(data);
        return result;
    }

    public static Result build(int code,String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result success() {
        return success(null);
    }
    // 未找到服务
    public static Result error500(String msg) {
        Result result = new Result();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }

    // 数据格式不正确
    public static Result error415(String msg) {
        Result result = new Result();
        result.setCode(415);
        result.setMsg(msg);
        return result;
    }

    public static Result error400(String msg) {
        Result result = new Result();
        result.setCode(400);
        result.setMsg(msg);
        return result;
    }
}
