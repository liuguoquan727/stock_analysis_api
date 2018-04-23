package com.michaelliu.stock.api.response;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

public class Response<T> {
  public int code;
  public String msg;
  public T data;
}
