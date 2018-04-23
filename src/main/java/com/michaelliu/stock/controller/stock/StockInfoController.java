package com.michaelliu.stock.controller.stock;

import com.michaelliu.stock.api.response.Response;
import com.michaelliu.stock.bean.StockInfo;
import com.michaelliu.stock.service.IStockInfoService;
import com.michaelliu.stock.utils.TextUtis;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@RequestMapping("api/stockinfo")
@RestController
public class StockInfoController {

  @Autowired IStockInfoService mStockInfoService;

  @RequestMapping(method = RequestMethod.GET, path = "/list")
  public List<StockInfo> getStockInfos() {
    return mStockInfoService.queryStockInfos();
  }

  @RequestMapping(method = RequestMethod.POST, path = "/query")
  public Response getStockInfoById(HttpServletRequest request, @RequestBody StockInfo info) {
    Response response = new Response();
    if (TextUtis.isEmpty(info.getGid())) {
      response.code = 2001;
      response.msg = "id不能为空";
    } else {

      try {
        response.code = 200;
        response.data = mStockInfoService.queryStockInfoById(info.getGid());
      } catch (Exception e) {
        response.code = 2002;
        response.msg = e.getMessage();
      }
    }
    return response;
  }
}
