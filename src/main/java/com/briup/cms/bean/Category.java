package com.briup.cms.bean;

import com.sun.javafx.beans.IDProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javafx.scene.chart.ValueAxis;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cms_category")
@ApiModel
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "栏目id")
    private int id;
    @ApiModelProperty(value = "栏目编号",required = true)
    private long code;
    @ApiModelProperty(value = "栏目名称",required = true)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
