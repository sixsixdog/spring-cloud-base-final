package com.sixsixdog.server;


import com.sixsixdog.dao.IBook;
import com.sixsixdog.entity.CBook;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: com.sixsixdog.server
 * @ClassName: BookServer
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-07 16:17
 * @Description:
 */
@Data
@Service
public class BookServer {
    IBook interfaceBook;

    @Autowired
    public void setInterfaceBook(IBook iBook) {
        this.interfaceBook = iBook;
    }

    public int getBookCount() {
        return interfaceBook.getCount();
    }

    public CBook getBookById(int id) {
        return interfaceBook.queryBookById(id);
    }

    public CBook addBook(CBook cBook) {
        interfaceBook.insertBook(cBook);
        return cBook;
    }
}
