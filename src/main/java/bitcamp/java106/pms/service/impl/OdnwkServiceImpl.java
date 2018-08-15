// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.OdnwkDao;
import bitcamp.java106.pms.dao.RvphoDao;
import bitcamp.java106.pms.domain.Odnwk;
import bitcamp.java106.pms.domain.Rvpho;
import bitcamp.java106.pms.service.OdnwkService;

@Service
public class OdnwkServiceImpl implements OdnwkService {
    
    OdnwkDao odnwkDao;
    RvphoDao rvphoDao;
    
    public OdnwkServiceImpl(OdnwkDao odnwkDao, RvphoDao rvphoDao) {
        this.odnwkDao = odnwkDao;
        this.rvphoDao = rvphoDao;
    }
    
    @Override
    public List<Odnwk> list(int no) {
        return odnwkDao.selectList(no);
    }
    
    @Override
    public List<Odnwk> listSellerSite() {
        return odnwkDao.selectSellerSite();
    }
    
    @Override
    public List<Odnwk> revList(int no) {
        return odnwkDao.selectRevList(no);
    }
    
    @Override
    public List<Odnwk> revCount(int no) {
        return odnwkDao.selectRevCount(no);
    }
    
    @Override
    public List<Odnwk> revDetail(int wno, int startNo, int pageNo) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("wno", wno);
        params.put("startNo", (startNo - 1) * pageNo);
        params.put("pageNo", pageNo);
        
        return odnwkDao.selectRevdetail(params);
    }
    
    @Override
    public Odnwk get(int no) {
        return odnwkDao.selectOne(no);
    }
    
    @Override
    public List<Odnwk> revGet(int no) {
        return odnwkDao.selectRevOne(no);
    }
    
    @Override
    public List<Odnwk> revGetList(int no) {
        return odnwkDao.selectRevListOne(no);
    }
    
    @Override
    public int add(Odnwk odnwk) {
        return odnwkDao.insert(odnwk);
    }
    
    @Override
    public int update(Odnwk odnwk, String rvpho) {
        
        Rvpho rvphos = new Rvpho();
        int no = odnwk.getNo();
        
        rvphos.setRevPhoto(rvpho);
        rvphos.setOdnwkNo(no);
        rvphoDao.insert(rvphos);
        
        return odnwkDao.update(odnwk);
    }
    
    @Override
    public int updateMod(Odnwk odnwk, String rvpho) {
        
        int no = odnwk.getNo();
        rvphoDao.delete(no);
        Rvpho rvphos = new Rvpho();
        rvphos.setRevPhoto(rvpho);
        rvphos.setOdnwkNo(no);
        rvphoDao.insert(rvphos);
        
        return odnwkDao.update(odnwk);
    }
    
    @Override
    public int delete(int no, int wsano) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("memno", no);
        params.put("wsano", wsano);
        return odnwkDao.delete(params);
    }
}