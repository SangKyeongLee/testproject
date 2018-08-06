package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

    BoardDao boardDao;
    
    public BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    @Override
    public List<Board> list(int pageNo, int pageSize) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startRowNo", (pageNo - 1) * pageSize);
        params.put("pageSize", pageSize);
        
        System.out.println((pageNo - 1) * pageSize);
        System.out.println(pageSize);
        
        return boardDao.selectList(params);
    }

    @Override
    public Board get(int no) {
        return boardDao.selectOne(no);
    }

    @Override
    public List<Board> commentList(int no) {
        return boardDao.commentList(no);
    }

    @Override
    public List<Board> hashtagList(int no) {
        return boardDao.hashtagList(no);
    }
    
}
