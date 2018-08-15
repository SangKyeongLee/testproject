//파일 업로드 - JSON
package bitcamp.java106.pms.web.json;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.HashMap;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Wkacp;
import bitcamp.java106.pms.service.MemberService;

@RestController 
@RequestMapping("/mpfile") 
public class MypageUpload {
    
    MemberService memberService;
    
    public MypageUpload(MemberService memberService) {
        this.memberService = memberService;
    }
 
     @Autowired ServletContext sc;
     
     @PostMapping("banner")
     public Object banner(
             String imageData, HttpSession session) {
         
         HashMap<String,Object> jsonData = new HashMap<>();
         int commaIdx = imageData.indexOf(",");
         String base64data = imageData.substring(commaIdx + 1);
         
         Decoder decoder = Base64.getDecoder();
         byte[] data = decoder.decode(base64data);
         
         Member member = (Member)session.getAttribute("loginUser");
         int userNo = member.getNo();
         
         
         String filename = UUID.randomUUID().toString();
         String filesDir = sc.getRealPath("/files/mypage/banner");
         try {
             File path = new File(filesDir + "/" + filename);
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));
             out.write(data);
             out.close();
             jsonData.put("status", "success");
             jsonData.put("filename", filename);
             
         } catch (Exception e) {
             jsonData.put("status", "fail");
             e.printStackTrace();
         }
         Member updMember = new Member();
         updMember.setNo(userNo);
         updMember.setBannerPhoto(filename);
         
         System.out.println(imageData);
         
         memberService.updateBphoto(updMember);
         
         return jsonData;
     }
     
     @PostMapping("profile")
     public Object profile(
             MultipartFile files) {
         
         HashMap<String,Object> jsonData = new HashMap<>();
         
         String filesDir = sc.getRealPath("/files/mypage/profile");
     
         String filename = UUID.randomUUID().toString();
         jsonData.put("filename", filename);
         jsonData.put("filesize", files.getSize());
         jsonData.put("originname", files.getOriginalFilename());
         try {
             File path = new File(filesDir + "/" + filename);
             System.out.println(path);
             files.transferTo(path);
         } catch (Exception e) {
             e.printStackTrace();
         }
         return jsonData;
     }
}