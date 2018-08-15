package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int no;
    private int memno;
    private Date createDate;
    private String content;
    private String path;
    private int count;
    private int like;
    
    private String hashtag;
    private String nickname;
    private String comments;
    
    private String product;
    private String address;
    private int poX;
    private int poY;
    private int lno;
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", memno=" + memno + ", createDate=" + createDate + ", content=" + content
                + ", path=" + path + ", count=" + count + ", like=" + like + ", hashtag=" + hashtag + ", nickname="
                + nickname + ", comments=" + comments + ", product=" + product + ", address=" + address + ", poX=" + poX
                + ", poY=" + poY + ", lno=" + lno + "]";
    }
    public int getLno() {
        return lno;
    }
    public void setLno(int lno) {
        this.lno = lno;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPoX() {
        return poX;
    }
    public void setPoX(int poX) {
        this.poX = poX;
    }
    public int getPoY() {
        return poY;
    }
    public void setPoY(int poY) {
        this.poY = poY;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getMemno() {
        return memno;
    }
    public void setMemno(int memno) {
        this.memno = memno;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getHashtag() {
        return hashtag;
    }
    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public int getLike() {
        return like;
    }
    public void setLike(int like) {
        this.like = like;
    }
    
    
    
    
    
    
    
}
