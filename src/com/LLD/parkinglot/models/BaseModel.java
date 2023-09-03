package com.LLD.parkinglot.models;

import java.util.Date;

public class BaseModel {//Put all common attributes

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;
}
