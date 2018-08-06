package bitcamp.java106.pms.service;

import java.util.List;

import bitcamp.java106.pms.domain.Board;

public interface BoardService {
    List<Board> list(int pageNo, int pageSize);
    Board get(int no);
    List<Board> commentList(int no);
    List<Board> hashtagList(int no);
}
