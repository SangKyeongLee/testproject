package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Odnwk;
import bitcamp.java106.pms.domain.Order;

public interface OrderDao {


    Order selectOne(int no);

    int insert(Order order);

    int update(Order order);

    List<Order> selectList(int no);

    //관리자 전용
    int adUpdate(Order order);
    
    Order adGet(int no);

    Object adList(int no);

}