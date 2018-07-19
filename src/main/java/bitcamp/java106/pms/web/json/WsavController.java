package bitcamp.java106.pms.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Wsav;
import bitcamp.java106.pms.service.WsavService;

@RestController
@RequestMapping("/wsav")
public class WsavController {
    
    WsavService wsavService;
    
    public WsavController(WsavService wsavService) {
        this.wsavService = wsavService;
    }

    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(Wsav wsav) throws Exception {
        wsavService.add(wsav);
    }
    
    @RequestMapping("delete")
    //@ResponseStatus(HttpStatus.OK) // 응답 상태 코드 값의 기본은 "200(OK)" 이다.
    public void delete(@RequestParam("no") int no) throws Exception {
        wsavService.delete(no);
    }
    
    @RequestMapping("list")
    public Object list() {        
        return wsavService.list();
    }
    
    @RequestMapping("update")
    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public void update(Wsav wsav) throws Exception {
        wsavService.update(wsav);
    }
    
    @RequestMapping("{no}")
    public Wsav view(@PathVariable int no) throws Exception {
        return wsavService.get(no);
    }

}

//ver 55 - JSON 데이터를 출력하는 페이지 컨트롤러 생성






