package bitcamp.java106.pms.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Workshop;
import bitcamp.java106.pms.service.MemberService;
import bitcamp.java106.pms.service.WorkshopService;

@RestController
@RequestMapping("/workshop")
public class WorkshopController {

    WorkshopService workshopService;
    MemberService memberService;
    
    public WorkshopController(
            WorkshopService workshopService) {
        this.workshopService = workshopService;
    }
    
    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(Workshop workshop) throws Exception {
        workshopService.add(workshop);
    }
    
    @RequestMapping("isExist/{isExistNo}") 
    public boolean isExist(@PathVariable int isExistNo) throws Exception {
        return workshopService.isExist(isExistNo); // 판매자 신청을 완료한 경우
    }
    
//    @RequestMapping("delete")
//    public void delete(@RequestParam("no") int no) throws Exception {
//        workshopService.delete(no);
//    }
//    
//    @RequestMapping("list{page}")
//    public Object list(
//            @MatrixVariable(defaultValue="1") int pageNo,
//            @MatrixVariable(defaultValue="3") int pageSize) {
//        return workshopService.list(pageNo, pageSize);
//    }
//    
//    @RequestMapping("update")
//    @ResponseStatus(HttpStatus.OK)
//    public void update(Member member) throws Exception {
//        workshopService.update(member);
//    }
//    
//    @RequestMapping("{id}")
//    public Member view(@PathVariable String id) throws Exception {
//        return workshopService.get(id);
//    }
//    
}



