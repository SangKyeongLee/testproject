package bitcamp.java106.pms.service.impl;

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
    public List<Board> list() {
        return boardDao.selectList();
    }

    @Override
    public Board get(int no) {
        return boardDao.selectOne(no);
    }
    
}
