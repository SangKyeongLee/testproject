// 로그인 폼 출력과 사용자 인증처리 서블릿
package bitcamp.java106.pms.web.json;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.service.MemberService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    MemberService memberService;
     
    public AuthController(MemberService memberService) {
        this.memberService = memberService;
    }
    
    @GetMapping("/loginUser")
    public Member loginUser(HttpSession session) {
        return (Member) session.getAttribute("loginUser");
    }
    
    @RequestMapping("/login")
    public Object login(
            @RequestParam("id") String id,
            @RequestParam("password") String password,
            @RequestParam(value="saveId",required=false) String saveId,
            HttpServletRequest request,
            HttpServletResponse response,
            HttpSession session) throws Exception {
        
        Cookie cookie = null;
        if (saveId != null) {
            // 입력폼에서 로그인할 때 사용한 ID를 자동으로 출력할 수 있도록 
            // 웹브라우저로 보내 저장시킨다.
            cookie = new Cookie("id", id);
            cookie.setMaxAge(60 * 60 * 24 * 7);
        } else { // "아이디 저장" 체크박스를 체크하지 않았다면 
            cookie = new Cookie("id", "");
            cookie.setMaxAge(0); // 웹브라우저에 "id"라는 이름으로 저장된 쿠키가 있다면 제거한다.
            // 즉 유효기간을 0으로 설정함으로써 "id"라는 이름의 쿠키를 무효화시키는 것이다.
        }
        response.addCookie(cookie);
        
        HashMap<String, Object> result = new HashMap<>();
        
        if (memberService.isExist(id, password)) { // 로그인 성공!
            session.setAttribute("loginUser", memberService.get(id));
            result.put("state", "success");

        } else { // 로그인 실패!
            session.invalidate();
            result.put("state", "fail");
        }
        return result;
    }
    
    @RequestMapping("/logout")
    public void logout(HttpSession session) throws Exception {
        // 세션을 꺼내 무효화시킨다.
        session.invalidate();
    }
    
    // 여기는 회원 아이디 찾기 부분에서 "이름", "휴대폰 번호"를 찾도록 하는 것이다.
    @RequestMapping("/searchId")
    public String searchId(
            @RequestParam("name") String name,
            @RequestParam("phoneNumber") String phoneNumber,
            HttpSession session) {
        
        // searchId : "이름"과 "휴대폰" 조건이 일치하면 "아이디(이메일)" 값을 불려온다.
        String searchId = memberService.searchId(name, phoneNumber);
        
        String result = null;
       
        // searchId 가 null 인경우 : 조회 실패
        // searchId 가 null 이 아닌 경우 : 유저가 등록되어있음
        if (searchId != null) {
            // request는 유효범위가 요청 후 종료이기 때문에 범위를 늘려
            // session에다가 저장했다.
            session.setAttribute("searchId", searchId);
            result = "success"; // 결과값을 success로 조건문 용으로 둔다.
        }
            
        return result; // success // null 둘중 하나로
    }
    
    // 이부분은 "이름", "휴대폰" 입력 후 최종적으로 아이디를 보여주는 것이다.
    // 이 메소드를 사용하기 전재 조건 : 위에 있는 searchId에서 먼저 세션값을 종료시킨다.
    @GetMapping("/searchIdEnd")
    public String searchIdEnd(
            HttpSession session) {
        // 세션을 계속 남겨두기에는 비효율성을 유발하는 것이기 때문에
        // 미리 searchId에 따로 변수로 저장하고 만료시키는 방법을 사용하였다.
        String searchId = (String) session.getAttribute("searchId");
        session.invalidate(); // 여기는 세션 종료 시킨다 (찾은 아이디의 대해 세션이 남으면 안되기 때문에)
        return searchId;
    }
    
    @RequestMapping("/searchPassword")
    public String searchPassword(
            @RequestParam("id") String id) {
        String result = null;
        if (memberService.isSearchPassword(id)) {
            result = "success";
        }
        return result;
    }
    
    @RequestMapping("/searchPasswordChange")
    @ResponseStatus(HttpStatus.OK)
    public void changePassword(
            @RequestParam("id") String id,
            @RequestParam("password") String password) {
        
        memberService.changePassword(id, password);
    }
    
}

