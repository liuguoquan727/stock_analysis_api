package com.michaelliu.stock.controller.stock;

import com.michaelliu.stock.bean.Stock;
import com.michaelliu.stock.bean.StockInfo;
import com.michaelliu.stock.mapper.StockInfoMapper;
import com.michaelliu.stock.mapper.StockMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@RequestMapping("api/stock")
@RestController
public class StockController {

  @Autowired StockMapper mStockMapper;

  @RequestMapping("/list")
  public List<Stock> getStockInfos() {
    return mStockMapper.queryStocks();
  }
}
