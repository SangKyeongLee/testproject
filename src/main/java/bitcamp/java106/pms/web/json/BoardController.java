package bitcamp.java106.pms.web.json;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.domain.Member;
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
        
        return boardService.list(pageNo, pageSize);
    }
    @RequestMapping("addlike{no}")
    public Object addLike(@PathVariable int no,HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        
        if(member == null) {
            System.out.println("notLogined");
            return "notLogined";
        }
                
        return boardService.addLike(no, member.getNo());
    }
    @RequestMapping("deletelike{no}")
    public Object deleteLike(@PathVariable int no,HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        int memNo = member.getNo();
        
        return boardService.deleteLike(no, memNo);
    }
    @RequestMapping("islikeone{no}")
    public Object isLikeOne(@PathVariable int no, HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        if(member == null) {
            System.out.println("notLogined");
            return "notLogined";
        };
        
        return boardService.isLikeOne(no, member.getNo());
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
    
    @RequestMapping("islike")
    public Object isLike(HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        try {
            return boardService.isLike(member.getNo());
        } catch(Exception e) {
            return "fail";
        }
    }
    
    @RequestMapping("addcmmt/{no}/{cmmt}")
    public Object addcomment(
            @PathVariable int no, 
            @PathVariable String cmmt, 
            HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        if(member == null) {
            System.out.println("notLogined");
            return "notLogined";
        };
        return boardService.addcomment(no, cmmt, member.getNo());
    }
    
    @RequestMapping("isWriter{no}")
    public Object isWriter(@PathVariable int no, HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        if(member == null) {
            System.out.println("notLogined");
            return "notLogined";
        };
        
        return boardService.isWriter(no, member.getNo());
    }
    
    @RequestMapping("selectLink{no}")
    public Object selectLink(@PathVariable int no) throws Exception {
        return boardService.selectLink(no);
    }
    
    @RequestMapping("deleteLink{no}")
    public Object deleteLink(@PathVariable int no) throws Exception {
        return boardService.deleteLink(no);
    }
    
    @RequestMapping("addLink")
    public Object addLink(Board board) throws Exception {
        return boardService.addLink(board);
    }
    
    @RequestMapping("selectLinkOne")
    public Object selectLinkOne() throws Exception {
        return boardService.selectLinkOne();
    }
    
}