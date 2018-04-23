package com.michaelliu.stock.controller.stock;

import com.michaelliu.stock.bean.StockInfo;
import com.michaelliu.stock.mapper.StockInfoMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@RequestMapping("api/stockinfo")
@RestController
public class StockInfoController {

  @Autowired StockInfoMapper mStockMapper;

  @RequestMapping("/list")
  public List<StockInfo> getStockInfos() {
    return mStockMapper.queryStockInfos();
  }
}
