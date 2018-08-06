package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Board;

public interface BoardDao {
    List<Board> selectList(Map<String,Object> params);
    Board selectOne(int no);
    List<Board> commentList(int no);
    List<Board> hashtagList(int no);
}
