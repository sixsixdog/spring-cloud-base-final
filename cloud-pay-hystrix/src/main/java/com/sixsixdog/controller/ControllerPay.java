package com.sixsixdog.controller;

import com.sixsixdog.server.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.sixsixdog.controller
 * @ClassName: ControllerPay
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-12 18:37
 * @Description:
 */

@RestController
public class ControllerPay {
    Payment payment;

    @Autowired
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @GetMapping(value = "/payment/info/{id}")
    public String paymentInfo_OK(@PathVariable Integer id) {
        return payment.paymentInfo_OK(id);
    }

    @GetMapping(value = "/payment/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable Integer id) {
        return payment.paymentInfo_TimeOut(id);
    }
}
