package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.dao.MainDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

    BoardDao boardDao;
    MainDao mainDao;
    
    public BoardServiceImpl(BoardDao boardDao, MainDao mainDao) {
        this.boardDao = boardDao;
        this.mainDao = mainDao;
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
    public int addLike(int no, int memNo) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("no", no);
        params.put("memNo",memNo);
        return boardDao.addLike(params);
    }
    @Override
    public int deleteLike(int no, int memNo) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("no", no);
        params.put("memNo",memNo);
        return boardDao.deleteLike(params);
    }
    @Override
    public List<Board> isLikeOne(int no, int memNo) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("no", no);
        params.put("memNo", memNo);
        return boardDao.isLikeOne(params);
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

    @Override
    public List<Board> selectListInMain() {
        System.out.println("Service.selectListInMain");
        return mainDao.selectListInMain();
    }

    @Override
    public List<Board> isLike(int no) {
        return boardDao.isLike(no);
    }

    @Override
    public int addcomment(int no, String cmmt, int memNo) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("no", no);
        params.put("cmmt",cmmt);
        params.put("memNo",memNo);

        return boardDao.addcomment(params);
    }

    @Override
    public Board isWriter(int no, int memNo) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("no", no);
        params.put("memNo", memNo);
        
        return boardDao.isWriter(params);
    }

    @Override
    public List<Board> selectLink(int no) {
        return boardDao.selectLink(no);
    }

    @Override
    public int deleteLink(int no) {
        return boardDao.deleteLink(no);
    }

    @Override
    public int addLink(Board board) {
        return boardDao.addLink(board);
    }

    @Override
    public Board selectLinkOne() {
        return boardDao.selectLinkOne();
    }

}
