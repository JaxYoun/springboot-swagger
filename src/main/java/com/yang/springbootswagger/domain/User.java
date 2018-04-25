package com.yang.springbootswagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "User", description = "用户实体类")
public class User implements Serializable {

    @ApiModelProperty(value = "学号")
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
