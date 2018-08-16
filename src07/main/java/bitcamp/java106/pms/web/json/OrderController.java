package bitcamp.java106.pms.web.json;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Order;
import bitcamp.java106.pms.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    
    @Autowired ServletContext sc;
    
    OrderService orderService;
    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //관리자 list
    @RequestMapping("adList")
    public Object adList(HttpSession session) {
        Member member = (Member)session.getAttribute("loginUser");
        int no = member.getNo();
        return orderService.adList(no);
    }
    
    //관리자 update
    @RequestMapping("adUpdate")
    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public Object adUpdate(Order order) throws Exception {
        return orderService.adUpdate(order);
    }
    
    //관리자 view
    @RequestMapping("adView/{no}")
    public Object adView(@PathVariable int no) throws Exception {
        return orderService.adGet(no);
    }
    
    
    
    //add
//    @RequestMapping("add")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void add(Order order) throws Exception {
//        orderService.add(order);
//    }
    
    
    //list
//    @RequestMapping("list")
//    public Object list(int no) {        
//        return orderService.list(no);
//    }
    
    //update
//    @RequestMapping("update")
//    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
//    public Object update(Order order) throws Exception {
//        
//        return orderService.update(order);
//    }
    
   
    //view   
//    @RequestMapping("{no}")
//    public Order view(@PathVariable int no) throws Exception {
//        return orderService.get(no);
//    }

}