// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.OdnwkDao;
import bitcamp.java106.pms.dao.OrderDao;
import bitcamp.java106.pms.dao.WorksDao;
import bitcamp.java106.pms.domain.Order;
import bitcamp.java106.pms.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
    OrderDao orderDao;
    WorksDao worksDao;
    OdnwkDao odnwkDao;
    
    public OrderServiceImpl(OrderDao orderDao, OdnwkDao odnwkDao, WorksDao worksDao) {
        this.orderDao = orderDao;
        this.worksDao = worksDao;
        this.odnwkDao = odnwkDao;
    }
    
    @Override
    public List<Order> list(int no) {
        return orderDao.selectList(no);
    }
    
    @Override
    public Order get(int no) {
        return orderDao.selectOne(no);
    }
    
    
    @Override
    public int add(Order order) {
        return orderDao.insert(order);
    }
    
    @Override
    public int update(Order order) {
        
        return orderDao.update(order);
    }

    
    //관리자 전용
    @Override
    public int adUpdate(Order order) {
        return orderDao.adUpdate(order);
    }

    @Override
    public Order adGet(int no) {
        return orderDao.adGet(no);
    }

    @Override
    public Object adList(int no) {
        return orderDao.adList(no); 
    }
    
    
    
}