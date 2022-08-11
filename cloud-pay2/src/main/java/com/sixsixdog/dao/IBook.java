package com.sixsixdog.dao;

import com.sixsixdog.entity.CBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Package: com.sixsixdog.dao
 * @ClassName: IBook
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-07 16:12
 * @Description:
 */

@Mapper
public interface IBook {
    int getCount();

    CBook queryBookById(int id);

    Integer insertBook(CBook cBook);
}
