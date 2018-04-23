package com.michaelliu.stock.mapper;

import com.michaelliu.stock.bean.Stock;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2018/4/23.
 */

@Mapper
@Component
public interface StockMapper {

  @Select("SELECT * FROM STOCK_NAME")
  List<Stock> queryStocks();

  @Select("select * from stock_name where id=#{gid}")
  Stock queryStockById(@Param("gid") String id);

  @Insert("insert into stock_name(gid,name) values(#{gid},#{name})")
  void insert(Stock stu);

  @Update("update stock_name set name=#{name} where id=#{id}")
  void update(Stock stu);

  @Delete("delete from stock_name where id=#{gid}")
  void delete(@Param("gid") String id);
}
