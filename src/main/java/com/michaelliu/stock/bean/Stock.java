package com.michaelliu.stock.bean;

import java.io.Serializable;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

public class Stock implements Serializable {
  private static final long serialVersionUID = -5818215116737223998L;
  /**
   * 股票id
   */
  private String gid;
  /**
   * 股票名
   */
  private String name;

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
}
