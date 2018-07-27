package bitcamp.java106.pms.dao;

import java.util.List;

import bitcamp.java106.pms.domain.Board;

public interface BoardDao {
    List<Board> selectList();
    Board selectOne(int no);
}
