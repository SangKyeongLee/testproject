package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;


public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private int memberNo;
    private String methodPay;
    private int devCost;
    private int totalCost;
    private Date orderDate;
    private String orderState;
    private String devMemo;
    private String curir;
    private String post;
    private String baseAddr;
    private String detailAddr;
    private String ivno;
    private Date claimDate;
    private String claimRequest;
    private String claimContext;
    private String proState;
    private String proContext;
    
    
    @Override
    public String toString() {
        return "Order [no=" + no + ", memberNo=" + memberNo + ", methodPay=" + methodPay + ", devCost=" + devCost
                + ", totalCost=" + totalCost + ", orderDate=" + orderDate + ", orderState=" + orderState + ", devMemo="
                + devMemo + ", curir=" + curir + ", post=" + post + ", baseAddr=" + baseAddr + ", detailAddr="
                + detailAddr + ", ivno=" + ivno + ", claimDate=" + claimDate + ", claimRequest=" + claimRequest
                + ", claimContext=" + claimContext + ", proState=" + proState + ", proContext=" + proContext + "]";
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getMemberNo() {
        return memberNo;
    }
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }
    public String getMethodPay() {
        return methodPay;
    }
    public void setMethodPay(String methodPay) {
        this.methodPay = methodPay;
    }
    public int getDevCost() {
        return devCost;
    }
    public void setDevCost(int devCost) {
        this.devCost = devCost;
    }
    public int getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getOrderState() {
        return orderState;
    }
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }
    public String getDevMemo() {
        return devMemo;
    }
    public void setDevMemo(String devMemo) {
        this.devMemo = devMemo;
    }
    public String getCurir() {
        return curir;
    }
    public void setCurir(String curir) {
        this.curir = curir;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public String getBaseAddr() {
        return baseAddr;
    }
    public void setBaseAddr(String baseAddr) {
        this.baseAddr = baseAddr;
    }
    public String getDetailAddr() {
        return detailAddr;
    }
    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }
    public String getIvno() {
        return ivno;
    }
    public void setIvno(String ivno) {
        this.ivno = ivno;
    }
    public Date getClaimDate() {
        return claimDate;
    }
    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }
    public String getClaimRequest() {
        return claimRequest;
    }
    public void setClaimRequest(String claimRequest) {
        this.claimRequest = claimRequest;
    }
    public String getClaimContext() {
        return claimContext;
    }
    public void setClaimContext(String claimContext) {
        this.claimContext = claimContext;
    }
    public String getProState() {
        return proState;
    }
    public void setProState(String proState) {
        this.proState = proState;
    }
    public String getProContext() {
        return proContext;
    }
    public void setProContext(String proContext) {
        this.proContext = proContext;
    }
    
    
}
