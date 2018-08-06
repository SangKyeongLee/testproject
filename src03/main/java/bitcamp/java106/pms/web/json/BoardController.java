package bitcamp.java106.pms.web.json;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
    
    BoardService boardService;
    
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }
    
    @RequestMapping("list")
    public Object list(
            @RequestParam(value="pageNo", defaultValue="1") int pageNo,
            @RequestParam(value="pageSize", defaultValue="5") int pageSize) {
        System.out.println(pageNo);
        System.out.println(pageSize);
        
        return boardService.list(pageNo, pageSize);
    }
    
    @RequestMapping("{no}")
    public Board view(@PathVariable int no) throws Exception {
        return boardService.get(no);
    }
    
    @RequestMapping("comment{no}")
    public Object commentList(@PathVariable int no) throws Exception {
        return boardService.commentList(no);
    }
    
    @RequestMapping("hashtag{no}")
    public Object hashtagList(@PathVariable int no) throws Exception {
        return boardService.hashtagList(no);
    }
}
