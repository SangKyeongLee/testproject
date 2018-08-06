package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;


public class Wsav implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private String title;
    private int minPerson;
    private int maxPerson;
    private Date experDate;
    private String startTime;
    private String endTime;
    
    private boolean prepareYn;
    private String prepareCont;
    private int price;
    private String content;
    private String addr;
    
    @Override
    public String toString() {
        return "Wsav [no=" + no + ", title=" + title + ", minPerson=" + minPerson + ", maxPerson=" + maxPerson
                + ", experDate=" + experDate + ", startTime=" + startTime + ", endTime=" + endTime + ", prepareYn="
                + prepareYn + ", prepareCont=" + prepareCont + ", price=" + price + ", content=" + content + ", addr="
                + addr + "]";
    }
    
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getMinPerson() {
        return minPerson;
    }
    public void setMinPerson(int minPerson) {
        this.minPerson = minPerson;
    }
    public int getMaxPerson() {
        return maxPerson;
    }
    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }
    public Date getExperDate() {
        return experDate;
    }
    public void setExperDate(Date experDate) {
        this.experDate = experDate;
    }
    public boolean isPrepareYn() {
        return prepareYn;
    }
    public void setPrepareYn(boolean prepareYn) {
        this.prepareYn = prepareYn;
    }
    public String getPrepareCont() {
        return prepareCont;
    }
    public void setPrepareCont(String prepareCont) {
        this.prepareCont = prepareCont;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    
}

//ver 31 - 생성자 제거 및 count 변수 제거
//ver 27 - java.io.Serializable 인터페이스 구현
//ver 24 - setNo() 변경
//ver 18 - 게시물 객체의 고유 번호(no)를 static 변수(count)를 이용하여 자동 설정한다. 
// ver 16 - 캡슐화 적용. 겟터, 셋터 추가.
// ver 13 - 등록일의 데이터 타입을 String에서 Date으로 변경






