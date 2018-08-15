package bitcamp.java106.pms.web.json;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bitcamp.java106.pms.domain.Odnwk;
import bitcamp.java106.pms.domain.Order;
import bitcamp.java106.pms.service.OrderService;
import net.coobird.thumbnailator.Thumbnails;

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
    public Object adList(int no) {        
        return orderService.adList(no);
    }
    
    //관리자 update
    @RequestMapping("adUpdate")
    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public Object adUpdate(Order order) throws Exception {
        
        
        return orderService.adUpdate(order);
    }
    
    //관리자 view
    @RequestMapping("adview/{no}")
    public Order adView(@PathVariable int no) throws Exception {
        
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