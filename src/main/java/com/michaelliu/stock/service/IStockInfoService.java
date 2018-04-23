package com.michaelliu.stock.service;

import com.michaelliu.stock.bean.StockInfo;
import java.util.List;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

public interface IStockInfoService {
  /**
   * 获取股票股价列表
   */
  List<StockInfo> queryStockInfos();

  /**
   * 根据id获取
   * @param id
   * @return
   */
  List<StockInfo> queryStockInfoById(String id);
}
