package com.michaelliu.stock.service.impl;

import com.michaelliu.stock.bean.Stock;
import com.michaelliu.stock.mapper.StockMapper;
import com.michaelliu.stock.service.IStockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@Service
public class StockServiceImpl implements IStockService {

  @Autowired StockMapper mStockMapper;

  @Override public List<Stock> queryStockInfos() {
    return mStockMapper.queryStocks();
  }
}
