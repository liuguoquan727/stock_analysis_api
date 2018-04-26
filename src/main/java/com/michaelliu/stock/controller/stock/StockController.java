package com.michaelliu.stock.controller.stock;

import com.michaelliu.stock.api.response.Response;
import com.michaelliu.stock.bean.Stock;
import com.michaelliu.stock.service.IStockService;
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

  @Autowired IStockService mStockService;

  @RequestMapping("/list")
  public Response getStockInfos() {
    Response response = new Response();
    try {
      response.code = 200;
      response.data = mStockService.queryStockInfos();
    } catch (Exception e) {
      response.code = 2002;
      response.msg = e.getMessage();
    }
    return response;
  }
}
