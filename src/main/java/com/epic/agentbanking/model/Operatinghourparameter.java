package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Operatinghourparameter generated by hbm2java
 */
@Entity
@Table(name="operatinghourparameter"
    ,catalog="abdev01"
)
public class Operatinghourparameter  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -8688372489822953476L;
	private String paramcode;
     private Date createtime;
     private String description;
     private String fromtimeperiod;
     private String fromtimeqty;
     private Date lastupdatedtime;
     private String lastupdateduser;
     private String totimeperiod;
     private String totimeqty;

    public Operatinghourparameter() {
    }

	
    public Operatinghourparameter(String paramcode, Date createtime, Date lastupdatedtime) {
        this.paramcode = paramcode;
        this.createtime = createtime;
        this.lastupdatedtime = lastupdatedtime;
    }
    public Operatinghourparameter(String paramcode, Date createtime, String description, String fromtimeperiod, String fromtimeqty, Date lastupdatedtime, String lastupdateduser, String totimeperiod, String totimeqty) {
       this.paramcode = paramcode;
       this.createtime = createtime;
       this.description = description;
       this.fromtimeperiod = fromtimeperiod;
       this.fromtimeqty = fromtimeqty;
       this.lastupdatedtime = lastupdatedtime;
       this.lastupdateduser = lastupdateduser;
       this.totimeperiod = totimeperiod;
       this.totimeqty = totimeqty;
    }
   
     @Id 

    
    @Column(name="PARAMCODE", unique=true, nullable=false, length=64)
    public String getParamcode() {
        return this.paramcode;
    }
    
    public void setParamcode(String paramcode) {
        this.paramcode = paramcode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATETIME", nullable=false, length=19)
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    
    @Column(name="DESCRIPTION", length=128)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="FROMTIMEPERIOD", length=64)
    public String getFromtimeperiod() {
        return this.fromtimeperiod;
    }
    
    public void setFromtimeperiod(String fromtimeperiod) {
        this.fromtimeperiod = fromtimeperiod;
    }

    
    @Column(name="FROMTIMEQTY", length=64)
    public String getFromtimeqty() {
        return this.fromtimeqty;
    }
    
    public void setFromtimeqty(String fromtimeqty) {
        this.fromtimeqty = fromtimeqty;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LASTUPDATEDTIME", nullable=false, length=19)
    public Date getLastupdatedtime() {
        return this.lastupdatedtime;
    }
    
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    
    @Column(name="LASTUPDATEDUSER", length=64)
    public String getLastupdateduser() {
        return this.lastupdateduser;
    }
    
    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    
    @Column(name="TOTIMEPERIOD", length=64)
    public String getTotimeperiod() {
        return this.totimeperiod;
    }
    
    public void setTotimeperiod(String totimeperiod) {
        this.totimeperiod = totimeperiod;
    }

    
    @Column(name="TOTIMEQTY", length=64)
    public String getTotimeqty() {
        return this.totimeqty;
    }
    
    public void setTotimeqty(String totimeqty) {
        this.totimeqty = totimeqty;
    }




}


