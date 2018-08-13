package bitcamp.java106.pms.domain;

import java.io.Serializable;

public class WorkOption implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int opno; // 옵션번호
    private String optionYn; // 옵션 여부
    private String attributeValue; // 속성값
    private String attributeName; // 속성명
    
    @Override
    public String toString() {
        return "WorkOption [opno=" + opno + ", optionYn=" + optionYn
                + ", attributeValue=" + attributeValue + ", attributeName="
                + attributeName + "]";
    }

    public String getOptionYn() {
        return optionYn;
    }

    public void setOptionYn(String optionYn) {
        this.optionYn = optionYn;
    }

    public int getOpno() {
        return opno;
    }

    public void setOpno(int opno) {
        this.opno = opno;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    
}
