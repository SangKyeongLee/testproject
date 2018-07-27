// 서비스 컴포넌트 - 회원관리 업무를 처리할 객체
package bitcamp.java106.pms.service;

import java.util.List;

import bitcamp.java106.pms.domain.Member;

public interface MemberService {
    // 서비스 컴포넌트에서 메서드명을 지을 때는 
    // 업무 용어를 사용하라!
    List<Member> list(int pageNo, int pageSize);
    Member get(String id); // 아이디 색인용
    boolean isExist(String id, String password); // 아이디 비밀번호 일치성 확인
    int add(Member member); // 회원가입용 메소드
    int update(Member member); // 마이페이지에서 회원 정보 수정용 메소드
    int delete(int no); // 회원 탈퇴용 메소드
    String searchId(String name, String phoneNumber); // 아이디 찾기를 위한 조건이 달린 메서드
    boolean isSearchPassword(String id);  // 비밀번호 찾기 메뉴에서 이메일을 찾았는지 여부
    int changePassword(String id, String password); // 비밀번호 찾으면 바로 변경
}








