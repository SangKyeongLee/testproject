package bitcamp.java106.pms.service;

import java.util.List;

import bitcamp.java106.pms.domain.Board;

public interface BoardService {
    List<Board> list();
    Board get(int no);
}
