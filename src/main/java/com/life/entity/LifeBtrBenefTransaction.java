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
 * LifeBtrBenefTransaction generated by hbm2java
 */
@Entity
@Table(name="life_btr_benef_transaction"
    ,schema="transactions"
)
public class LifeBtrBenefTransaction  implements java.io.Serializable {


     private int btrAuthNumber;
     private Date btrDate;
     private String btrDescription;
     private double btrAmount;
     private int btrIdClient;
     private int btrIdBened;
     private int btrIdOrProduct;
     private int btrIdDesProduct;
     private String btrProductType;

    public LifeBtrBenefTransaction() {
    }

	
    public LifeBtrBenefTransaction(int btrAuthNumber, Date btrDate, double btrAmount, int btrIdClient, int btrIdBened, int btrIdOrProduct, int btrIdDesProduct, String btrProductType) {
        this.btrAuthNumber = btrAuthNumber;
        this.btrDate = btrDate;
        this.btrAmount = btrAmount;
        this.btrIdClient = btrIdClient;
        this.btrIdBened = btrIdBened;
        this.btrIdOrProduct = btrIdOrProduct;
        this.btrIdDesProduct = btrIdDesProduct;
        this.btrProductType = btrProductType;
    }
    public LifeBtrBenefTransaction(int btrAuthNumber, Date btrDate, String btrDescription, double btrAmount, int btrIdClient, int btrIdBened, int btrIdOrProduct, int btrIdDesProduct, String btrProductType) {
       this.btrAuthNumber = btrAuthNumber;
       this.btrDate = btrDate;
       this.btrDescription = btrDescription;
       this.btrAmount = btrAmount;
       this.btrIdClient = btrIdClient;
       this.btrIdBened = btrIdBened;
       this.btrIdOrProduct = btrIdOrProduct;
       this.btrIdDesProduct = btrIdDesProduct;
       this.btrProductType = btrProductType;
    }
   
     @Id 

    
    @Column(name="btr_auth_number", unique=true, nullable=false)
    public int getBtrAuthNumber() {
        return this.btrAuthNumber;
    }
    
    public void setBtrAuthNumber(int btrAuthNumber) {
        this.btrAuthNumber = btrAuthNumber;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="btr_date", nullable=false, length=13)
    public Date getBtrDate() {
        return this.btrDate;
    }
    
    public void setBtrDate(Date btrDate) {
        this.btrDate = btrDate;
    }

    
    @Column(name="btr_description", length=100)
    public String getBtrDescription() {
        return this.btrDescription;
    }
    
    public void setBtrDescription(String btrDescription) {
        this.btrDescription = btrDescription;
    }

    
    @Column(name="btr_amount", nullable=false, precision=17, scale=17)
    public double getBtrAmount() {
        return this.btrAmount;
    }
    
    public void setBtrAmount(double btrAmount) {
        this.btrAmount = btrAmount;
    }

    
    @Column(name="btr_id_client", nullable=false)
    public int getBtrIdClient() {
        return this.btrIdClient;
    }
    
    public void setBtrIdClient(int btrIdClient) {
        this.btrIdClient = btrIdClient;
    }

    
    @Column(name="btr_id_bened", nullable=false)
    public int getBtrIdBened() {
        return this.btrIdBened;
    }
    
    public void setBtrIdBened(int btrIdBened) {
        this.btrIdBened = btrIdBened;
    }

    
    @Column(name="btr_id_or_product", nullable=false)
    public int getBtrIdOrProduct() {
        return this.btrIdOrProduct;
    }
    
    public void setBtrIdOrProduct(int btrIdOrProduct) {
        this.btrIdOrProduct = btrIdOrProduct;
    }

    
    @Column(name="btr_id_des_product", nullable=false)
    public int getBtrIdDesProduct() {
        return this.btrIdDesProduct;
    }
    
    public void setBtrIdDesProduct(int btrIdDesProduct) {
        this.btrIdDesProduct = btrIdDesProduct;
    }

    
    @Column(name="btr_product_type", nullable=false, length=1)
    public String getBtrProductType() {
        return this.btrProductType;
    }
    
    public void setBtrProductType(String btrProductType) {
        this.btrProductType = btrProductType;
    }




}


