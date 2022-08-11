package com.sixsixdog.controller;

import com.sixsixdog.entity.CBook;
import com.sixsixdog.server.BookServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Package: com.sixsixdog.controller
 * @ClassName: bookCheck
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-07 16:21
 * @Description:
 */
@Slf4j
@RestController
public class bookCheck {
    BookServer bookServer;
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    public void setBookServer(BookServer bookServer) {
        this.bookServer = bookServer;
    }


    @GetMapping("/bookCheck")
    public Integer check() {
        return bookServer.getBookCount();
    }

    @GetMapping("/getBook/{id}")
    public CBook getBook(@PathVariable("id") int id)
    {
        log.debug("port:{}",serverPort);
        return bookServer.getBookById(id);
    }

    @PostMapping("/addBook")
    public CBook addBook(@RequestBody CBook cBook)
    {
        log.debug("port:{}",serverPort);
        return bookServer.addBook(cBook);
    }
}
