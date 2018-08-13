package bitcamp.java106.pms.dao;

import java.util.List;

import bitcamp.java106.pms.domain.Works;
import bitcamp.java106.pms.domain.Workshop;

public interface SearchDao {
    List<Works> selectList(String title);
    List<Workshop> storeList(String title);
    Works selectOne(int no);
}