package com.example.springapplication.Stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/factory")
public class StockController {

    public Logger logger = LogManager.getLogger(StockController.class);

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/getallstock")
    public List<Stock> getAllStock(){
        logger.info("Fetching the list of all stock items");
        return stockRepository.findAll();
    }

    @GetMapping("/getStockById")
    public Optional<Stock> getStockById(@PathVariable Long stockId){
        return stockRepository.findById(stockId);
    }

    @PostMapping("/addStock")
    public String addStockItem(@RequestBody Stock stock){
        stockRepository.save(stock);
        return "success";
    }
}
