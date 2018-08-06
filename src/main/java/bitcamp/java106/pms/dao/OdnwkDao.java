package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Odnwk;

public interface OdnwkDao {
    int delete(Map<String,Object> params) ;
    List<Odnwk> selectList(int no);
    int insert(Odnwk odnwk);
    int update(Odnwk odnwk);
    Odnwk selectOne(int no);
    List<Odnwk> selectRevOne(int no);
}