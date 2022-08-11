package com.sixsixdog.server;

import com.sixsixdog.entity.CBook;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Package: com.sixsixdog.server
 * @ClassName: FeignServer
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-11 21:04
 * @Description:
 */

@Component
@FeignClient(value = "CLOUD-PAY")
public interface FeignServer {

    @PostMapping("/addBook")
    public CBook addBook(@RequestBody CBook cBook);

}
