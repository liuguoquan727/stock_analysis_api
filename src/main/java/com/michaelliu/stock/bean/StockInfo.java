package com.michaelliu.stock.bean;

import java.io.Serializable;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

public class StockInfo implements Serializable {

  private static final long serialVersionUID = 4410701705438426795L;
  private String gid;
  private String name;
  private double price;
  private long time_stamp;
  private String date_time;

  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public long getTimestamp() {
    return time_stamp;
  }

  public void setTimestamp(long timestamp) {
    this.time_stamp = timestamp;
  }

  public String getDate() {
    return date_time;
  }

  public void setDate(String date) {
    this.date_time = date;
  }
}
