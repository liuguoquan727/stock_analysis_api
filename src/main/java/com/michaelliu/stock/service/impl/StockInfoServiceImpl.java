package com.michaelliu.stock.service.impl;

import com.michaelliu.stock.bean.StockInfo;
import com.michaelliu.stock.mapper.StockInfoMapper;
import com.michaelliu.stock.service.IStockInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@Service
public class StockInfoServiceImpl implements IStockInfoService {

  @Autowired StockInfoMapper mStockInfoMapper;

  @Override public List<StockInfo> queryStockInfos() {
    return mStockInfoMapper.queryStockInfos();
  }

  @Override public List<StockInfo> queryStockInfoById(String id) {
    return mStockInfoMapper.queryStockInfoById(id);
  }
}
