package bitcamp.java106.pms.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Works;
import bitcamp.java106.pms.service.WorksService;

@RestController
@RequestMapping("/works")
public class WorksController {
    
    WorksService worksService;
    
    public WorksController(WorksService worksService) {
        this.worksService = worksService;
    }

    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(Works works) throws Exception {
        worksService.add(works);
    }
    
    @RequestMapping("delete")
    //@ResponseStatus(HttpStatus.OK) // 응답 상태 코드 값의 기본은 "200(OK)" 이다.
    public void delete(@RequestParam("no") int no) throws Exception {
        worksService.delete(no);
    }
    
    @RequestMapping("list")
    public Object list() {       
        return worksService.list();
    }
    
    @RequestMapping("update")
    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public void update(Works works) throws Exception {
        worksService.update(works);
    }
    
    @RequestMapping("{no}")
    public Works view(@PathVariable int no) throws Exception {
        return worksService.get(no);
    }

}

//ver 55 - JSON 데이터를 출력하는 페이지 컨트롤러 생성






