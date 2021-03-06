package org.main.pojo;
// Generated Nov 20, 2016 3:22:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblGroupAccount generated by hbm2java
 */
public class TblGroupAccount  implements java.io.Serializable {


     private String txtId;
     private String txtGroupId;
     private String txtGroupCode;
     private String txtProjectId;
     private Integer txtPaidAmt;
     private String txtRemark;
     private Date txtEntryDate;
     private String txtEnteredBy;
     private Character txtIsActive;

    public TblGroupAccount() {
    }

	
    public TblGroupAccount(String txtId) {
        this.txtId = txtId;
    }
    public TblGroupAccount(String txtId, String txtGroupId, String txtGroupCode, String txtProjectId, Integer txtPaidAmt, String txtRemark, Date txtEntryDate, String txtEnteredBy, Character txtIsActive) {
       this.txtId = txtId;
       this.txtGroupId = txtGroupId;
       this.txtGroupCode = txtGroupCode;
       this.txtProjectId = txtProjectId;
       this.txtPaidAmt = txtPaidAmt;
       this.txtRemark = txtRemark;
       this.txtEntryDate = txtEntryDate;
       this.txtEnteredBy = txtEnteredBy;
       this.txtIsActive = txtIsActive;
    }
   
    public String getTxtId() {
        return this.txtId;
    }
    
    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }
    public String getTxtGroupId() {
        return this.txtGroupId;
    }
    
    public void setTxtGroupId(String txtGroupId) {
        this.txtGroupId = txtGroupId;
    }
    public String getTxtGroupCode() {
        return this.txtGroupCode;
    }
    
    public void setTxtGroupCode(String txtGroupCode) {
        this.txtGroupCode = txtGroupCode;
    }
    public String getTxtProjectId() {
        return this.txtProjectId;
    }
    
    public void setTxtProjectId(String txtProjectId) {
        this.txtProjectId = txtProjectId;
    }
    public Integer getTxtPaidAmt() {
        return this.txtPaidAmt;
    }
    
    public void setTxtPaidAmt(Integer txtPaidAmt) {
        this.txtPaidAmt = txtPaidAmt;
    }
    public String getTxtRemark() {
        return this.txtRemark;
    }
    
    public void setTxtRemark(String txtRemark) {
        this.txtRemark = txtRemark;
    }
    public Date getTxtEntryDate() {
        return this.txtEntryDate;
    }
    
    public void setTxtEntryDate(Date txtEntryDate) {
        this.txtEntryDate = txtEntryDate;
    }
    public String getTxtEnteredBy() {
        return this.txtEnteredBy;
    }
    
    public void setTxtEnteredBy(String txtEnteredBy) {
        this.txtEnteredBy = txtEnteredBy;
    }
    public Character getTxtIsActive() {
        return this.txtIsActive;
    }
    
    public void setTxtIsActive(Character txtIsActive) {
        this.txtIsActive = txtIsActive;
    }




}


