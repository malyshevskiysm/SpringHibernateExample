package com.mkyong.stock.model;

import java.io.Serializable;
/**
 * Created by Sergey on 01.12.2016.
 */
public class Stock implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long stockId;
    private String stockCode;
    private String stockName;

    public Long getStockId() {
        return stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
