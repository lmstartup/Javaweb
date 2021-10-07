package com.aaa.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lmstart
 * @date 2021/9/21 - 20:41
 */
@Data
@Accessors(chain = true)
public class Emp {
    private String id;
    private String name;
    private String path;
    private Double salary;
    private Integer age;
}
