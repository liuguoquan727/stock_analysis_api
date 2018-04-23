package com.michaelliu.stock.service;

import com.michaelliu.stock.bean.Stock;
import java.util.List;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

public interface IStockService {

  /**
   * 获取股票名称列表
   * @return
   */
  public List<Stock> queryStockInfos();
}
