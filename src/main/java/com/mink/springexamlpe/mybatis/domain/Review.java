package com.mink.springexamlpe.mybatis.domain;


import java.time.LocalDateTime;

public class Review {

    private int id;
    private int storeId;
    private String menu;
    private String userName;
    private int point;
    private String reivew;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getReivew() {
        return reivew;
    }

    public void setReivew(String reivew) {
        this.reivew = reivew;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
