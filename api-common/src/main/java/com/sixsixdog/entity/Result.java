package com.sixsixdog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Package: com.sixsixdog.entity
 * @ClassName: ConResult
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-11 21:25
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    Integer code;
    String msg;
    T data;
}
