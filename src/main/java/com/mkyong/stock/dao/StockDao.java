package com.mkyong.stock.dao;

import com.mkyong.stock.model.Stock;

/**
 * Created by Sergey on 01.12.2016.
 */
public interface StockDao {

    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}
