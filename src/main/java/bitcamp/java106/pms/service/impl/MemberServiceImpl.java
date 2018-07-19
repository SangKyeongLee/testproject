// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
    // 해당 메소드의 대해 알고 싶으면 자세한건 인터페이스 참조
    MemberDao memberDao;
    
    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    
    @Override
    public List<Member> list(int pageNo, int pageSize) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startRowNo", (pageNo - 1) * pageSize);
        params.put("pageSize", pageSize);
        
        return memberDao.selectList(params);
    }
    
    @Override
    public Member get(String id) {
        return memberDao.selectOne(id);
    }
    
    @Override
    public boolean isExist(String id, String password) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("id", id);
        params.put("password", password);
        
        return memberDao.count(params) > 0 ? true : false;
    }
    
    @Override
    public int add(Member member) {
        return memberDao.insert(member);
    }
    
    @Override
    public int update(Member member) {
        return memberDao.update(member);
    }
    
    @Override
    public int delete(int no) {
        return memberDao.delete(no);
    }
    
    @Override
    public String searchId(String name, String phoneNumber) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("phoneNumber", phoneNumber);
        
        return memberDao.selectSearchOne(params);
    }
    
    @Override
    public boolean isSearchPassword(String id) {
        return memberDao.selectSearchPassword(id) > 0 ? true : false;
    }
    
    @Override
    public int changePassword(String id, String password) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", id);
        params.put("password", password);
        
        return memberDao.updatePassword(params);
    }
    
}







