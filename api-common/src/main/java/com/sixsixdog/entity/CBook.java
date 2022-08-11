package com.sixsixdog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: com.sixsixdog.entity
 * @ClassName: book
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-07 16:08
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CBook {
    Integer id;
    String name;
    float price;
    String author;
}
