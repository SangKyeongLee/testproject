package bitcamp.java106.pms.web.json;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.WorkOption;
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
    
    // 여기는 제품 리스틀 간단히 보여주는걸 의미
    @RequestMapping("list")
    public Object list() {       
        return worksService.list();
    }
    
    @RequestMapping("update")
    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public void update(Works works) throws Exception {
        worksService.update(works);
    }
    
    // 여기는 상세 보기용
    @RequestMapping("{no}")
    public Works view(@PathVariable int no) throws Exception {
        return worksService.get(no);
    }
    
    // 옵션보기
    @RequestMapping("option/{no}")
    public WorkOption viewOption(
            @PathVariable int no) {
        System.out.println("worksControllor() 정상처리");
        return worksService.OptionValue(no);
    }

}







