package com.michaelliu.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.michaelliu.stock.mapper")
public class StockAnalysisApplication {

  public static void main(String[] args) {
    SpringApplication.run(StockAnalysisApplication.class, args);
  }
}
