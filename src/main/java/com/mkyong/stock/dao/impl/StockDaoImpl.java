package com.mkyong.stock.dao.impl;

import java.util.List;

import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Sergey on 01.12.2016.
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao{

    public void save(Stock stock){
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock){
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock){
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode){
        List list = getHibernateTemplate().find(
                "from stocks where stockCode=?", stockCode
        );
        return (Stock)list.get(0);
    }
}
