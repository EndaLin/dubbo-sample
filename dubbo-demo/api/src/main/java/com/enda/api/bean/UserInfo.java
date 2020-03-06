package com.enda.api.bean;

import java.io.Serializable;

/**
 * @author Ienovo
 */
public class UserInfo implements Serializable {
    private Integer id;
    private String name;

    public UserInfo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
