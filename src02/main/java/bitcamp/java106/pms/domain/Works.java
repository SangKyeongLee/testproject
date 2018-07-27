package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;

public class Works implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int no;
    private String title;
    private int price;
    private Date registeredDate;
    private int capacity;
    private String salesStatus;
    private String productDetail;
    private boolean deliveryPrice;
    private String requestDetail;
    
    
    
    
    
    @Override
    public String toString() {
        return "Works [no=" + no + ", title=" + title + ", price=" + price + ", registeredDate=" + registeredDate
                + ", capacity=" + capacity + ", salesStatus=" + salesStatus + ", productDetail=" + productDetail
                + ", deliveryPrice=" + deliveryPrice + ", requestDetail=" + requestDetail + "]";
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Date getRegisteredDate() {
        return registeredDate;
    }
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getSalesStatus() {
        return salesStatus;
    }
    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus;
    }
    public String getProductDetail() {
        return productDetail;
    }
    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
    public boolean isDeliveryPrice() {
        return deliveryPrice;
    }
    public void setDeliveryPrice(boolean deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public String getRequestDetail() {
        return requestDetail;
    }
    public void setRequestDetail(String requestDetail) {
        this.requestDetail = requestDetail;
    }
    
   
    
}
