// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.WsavDao;
import bitcamp.java106.pms.domain.Wsav;
import bitcamp.java106.pms.service.WsavService;

@Service
public class WsavServiceImpl implements WsavService {
    
    WsavDao wsavDao;
    
    public WsavServiceImpl(WsavDao wsavDao) {
        this.wsavDao = wsavDao;
    }
    
    @Override
    public List<Wsav> list(int no) {
        return wsavDao.selectList(no);
    }
    
    @Override
    public Wsav get(int no) {
        return wsavDao.selectOne(no);
    }
    
    @Override
    public int add(Wsav wsav) {
        return wsavDao.insert(wsav);
    }
    
    @Override
    public int update(Wsav wsav) {
        return wsavDao.update(wsav);
    }
    
    @Override
    public int delete(int no, int wsano) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("memno", no);
        params.put("wsano", wsano);
        return wsavDao.delete(params);
    }
}

//ver 53 - 클래스 추가






