package com.demo.domain;

import java.util.Date;

public class OrderDO {
    private Long id;

    private String detail;

    private String buyer;

    private Date createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "OrderDO{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", buyer='" + buyer + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}