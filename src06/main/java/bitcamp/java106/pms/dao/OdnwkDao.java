package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Odnwk;

public interface OdnwkDao {
    int delete(Map<String,Object> params) ;
    List<Odnwk> selectList(int no);
    List<Odnwk> selectSellerSite();
    List<Odnwk> selectRevList(int no);
    int insert(Odnwk odnwk);
    int update(Odnwk odnwk);
    int updateMod(Odnwk odnwk);
    Odnwk selectOne(int no);
    List<Odnwk> selectRevOne(int no);
    List<Odnwk> selectRevListOne(int no);
}