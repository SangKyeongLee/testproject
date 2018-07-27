// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.WorkshopDao;
import bitcamp.java106.pms.domain.Workshop;
import bitcamp.java106.pms.service.WorkshopService;

@Service
public class WorkshopServiceImpl implements WorkshopService {
    // 해당 메소드의 대해 알고 싶으면 자세한건 인터페이스 참조
    WorkshopDao workshopDao;
    
    public WorkshopServiceImpl(WorkshopDao workshopDao) {
        this.workshopDao = workshopDao;
    }

    // 판매자 추가 관련 메소드
    @Override
    public int add(Workshop workshop) {
        return workshopDao.insert(workshop);
    }

    // 판매자 등록 되어있는지 검사!
    @Override
    public boolean isExist(int no) {
        return workshopDao.selectOneNumber(no) > 0 ? true : false;
    }
    
    
}







