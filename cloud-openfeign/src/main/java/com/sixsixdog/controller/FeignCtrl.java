package com.sixsixdog.controller;

import com.sixsixdog.entity.CBook;
import com.sixsixdog.entity.Result;
import com.sixsixdog.entity.PublicCode.ResultUtil;
import com.sixsixdog.server.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.sixsixdog.controller
 * @ClassName: FeignCtrl
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-11 21:09
 * @Description:
 */



@RestController
public class FeignCtrl {
    FeignServer feignServer;

    @Autowired
    public void setFeignServer(FeignServer feignServer) {
        this.feignServer = feignServer;
    }

    @PostMapping("/addBook")
    public Result addBook(@RequestBody CBook cBook) {
        CBook res = null;
        try{
            res = feignServer.addBook(cBook);
        }catch (Exception e){
            return ResultUtil.error500(e.getMessage());
        }
        return ResultUtil.success(res);
    }
}
