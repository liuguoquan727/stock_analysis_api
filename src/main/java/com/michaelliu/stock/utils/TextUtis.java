package com.michaelliu.stock.utils;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

public class TextUtis {
  public static boolean isEmpty(String s) {
    if (s == null) {
      return true;
    }
    if (s.isEmpty()) {
      return true;
    }
    return false;
  }
}
