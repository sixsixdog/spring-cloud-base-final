package com.sixsixdog.server;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Package: com.sixsixdog.server
 * @ClassName: Payment
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-12 18:33
 * @Description:
 */
@Service
public class Payment {
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }
    public String paymentInfo_TimeOut(Integer id) {
        int time = 3;
        try{
            TimeUnit.SECONDS.sleep(time);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:" + id + "\t" + "O(∩_∩)O哈哈~ 耗时：" + time + "秒";
    }
    public String paymentInfo_Error(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_Error,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }
}
