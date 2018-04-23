package com.michaelliu.stock.mapper;

import com.michaelliu.stock.bean.StockInfo;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@Mapper
@Component
public interface StockInfoMapper {
  @Select("SELECT * FROM STOCK_HISTORY")
  List<StockInfo> queryStockInfos();

  @Select("select * from stock_history where id=#{gid}")
  StockInfo queryStockInfoById(@Param("gid") String id);

  @Delete("delete from stock_history where id=#{gid}")
  void delete(@Param("gid") String id);
}
