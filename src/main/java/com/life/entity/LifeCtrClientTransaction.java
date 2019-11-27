package com.life.entity;
// Generated 12-may-2019 21:18:20 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LifeCtrClientTransaction generated by hbm2java
 */
@Entity
@Table(name="life_ctr_client_transaction"
    ,schema="transactions"
)
public class LifeCtrClientTransaction  implements java.io.Serializable {


     private int ctrAuthNumber;
     private Date ctrDate;
     private String ctrDescription;
     private double ctrAmount;
     private int ctrIdClient;
     private int ctrIdOrProduct;
     private int ctrIdDesProduct;
     private String ctrProductType;

    public LifeCtrClientTransaction() {
    }

	
    public LifeCtrClientTransaction(int ctrAuthNumber, Date ctrDate, double ctrAmount, int ctrIdClient, int ctrIdOrProduct, int ctrIdDesProduct, String ctrProductType) {
        this.ctrAuthNumber = ctrAuthNumber;
        this.ctrDate = ctrDate;
        this.ctrAmount = ctrAmount;
        this.ctrIdClient = ctrIdClient;
        this.ctrIdOrProduct = ctrIdOrProduct;
        this.ctrIdDesProduct = ctrIdDesProduct;
        this.ctrProductType = ctrProductType;
    }
    public LifeCtrClientTransaction(int ctrAuthNumber, Date ctrDate, String ctrDescription, double ctrAmount, int ctrIdClient, int ctrIdOrProduct, int ctrIdDesProduct, String ctrProductType) {
       this.ctrAuthNumber = ctrAuthNumber;
       this.ctrDate = ctrDate;
       this.ctrDescription = ctrDescription;
       this.ctrAmount = ctrAmount;
       this.ctrIdClient = ctrIdClient;
       this.ctrIdOrProduct = ctrIdOrProduct;
       this.ctrIdDesProduct = ctrIdDesProduct;
       this.ctrProductType = ctrProductType;
    }
   
     @Id 

    
    @Column(name="ctr_auth_number", unique=true, nullable=false)
    public int getCtrAuthNumber() {
        return this.ctrAuthNumber;
    }
    
    public void setCtrAuthNumber(int ctrAuthNumber) {
        this.ctrAuthNumber = ctrAuthNumber;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ctr_date", nullable=false, length=13)
    public Date getCtrDate() {
        return this.ctrDate;
    }
    
    public void setCtrDate(Date ctrDate) {
        this.ctrDate = ctrDate;
    }

    
    @Column(name="ctr_description", length=100)
    public String getCtrDescription() {
        return this.ctrDescription;
    }
    
    public void setCtrDescription(String ctrDescription) {
        this.ctrDescription = ctrDescription;
    }

    
    @Column(name="ctr_amount", nullable=false, precision=17, scale=17)
    public double getCtrAmount() {
        return this.ctrAmount;
    }
    
    public void setCtrAmount(double ctrAmount) {
        this.ctrAmount = ctrAmount;
    }

    
    @Column(name="ctr_id_client", nullable=false)
    public int getCtrIdClient() {
        return this.ctrIdClient;
    }
    
    public void setCtrIdClient(int ctrIdClient) {
        this.ctrIdClient = ctrIdClient;
    }

    
    @Column(name="ctr_id_or_product", nullable=false)
    public int getCtrIdOrProduct() {
        return this.ctrIdOrProduct;
    }
    
    public void setCtrIdOrProduct(int ctrIdOrProduct) {
        this.ctrIdOrProduct = ctrIdOrProduct;
    }

    
    @Column(name="ctr_id_des_product", nullable=false)
    public int getCtrIdDesProduct() {
        return this.ctrIdDesProduct;
    }
    
    public void setCtrIdDesProduct(int ctrIdDesProduct) {
        this.ctrIdDesProduct = ctrIdDesProduct;
    }

    
    @Column(name="ctr_product_type", nullable=false, length=1)
    public String getCtrProductType() {
        return this.ctrProductType;
    }
    
    public void setCtrProductType(String ctrProductType) {
        this.ctrProductType = ctrProductType;
    }




}

