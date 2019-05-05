package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Agentparam generated by hbm2java
 */
@Entity
@Table(name="agentparam"
    ,catalog="abdev01"
)
public class Agentparam  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -7488701655991700944L;
	private AgentparamId id;
     private Agentcategory agentcategory;
     private Status status;
     private Transactiontype transactiontype;
     private Date createdtime;
     private Date lastupdatedtime;
     private String lastupdateduser;
     private long threshold;
     private long txnamountmax;
     private long txnamountmin;
     private long txnlimit;
     private int txnnomax;

    public Agentparam() {
    }

	
    public Agentparam(AgentparamId id, Agentcategory agentcategory, Status status, Transactiontype transactiontype, long threshold, long txnamountmax, long txnamountmin, long txnlimit, int txnnomax) {
        this.id = id;
        this.agentcategory = agentcategory;
        this.status = status;
        this.transactiontype = transactiontype;
        this.threshold = threshold;
        this.txnamountmax = txnamountmax;
        this.txnamountmin = txnamountmin;
        this.txnlimit = txnlimit;
        this.txnnomax = txnnomax;
    }
    public Agentparam(AgentparamId id, Agentcategory agentcategory, Status status, Transactiontype transactiontype, Date createdtime, Date lastupdatedtime, String lastupdateduser, long threshold, long txnamountmax, long txnamountmin, long txnlimit, int txnnomax) {
       this.id = id;
       this.agentcategory = agentcategory;
       this.status = status;
       this.transactiontype = transactiontype;
       this.createdtime = createdtime;
       this.lastupdatedtime = lastupdatedtime;
       this.lastupdateduser = lastupdateduser;
       this.threshold = threshold;
       this.txnamountmax = txnamountmax;
       this.txnamountmin = txnamountmin;
       this.txnlimit = txnlimit;
       this.txnnomax = txnnomax;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="agentcategory", column=@Column(name="AGENTCATEGORY", nullable=false, length=16) ), 
        @AttributeOverride(name="txntype", column=@Column(name="TXNTYPE", nullable=false, length=16) ) } )
    public AgentparamId getId() {
        return this.id;
    }
    
    public void setId(AgentparamId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="AGENTCATEGORY", nullable=false, insertable=false, updatable=false)
    public Agentcategory getAgentcategory() {
        return this.agentcategory;
    }
    
    public void setAgentcategory(Agentcategory agentcategory) {
        this.agentcategory = agentcategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STATUS", nullable=false)
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TXNTYPE", nullable=false, insertable=false, updatable=false)
    public Transactiontype getTransactiontype() {
        return this.transactiontype;
    }
    
    public void setTransactiontype(Transactiontype transactiontype) {
        this.transactiontype = transactiontype;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATEDTIME", length=19)
    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LASTUPDATEDTIME", length=19)
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

    
    @Column(name="THRESHOLD", nullable=false, precision=16, scale=0)
    public long getThreshold() {
        return this.threshold;
    }
    
    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }

    
    @Column(name="TXNAMOUNTMAX", nullable=false, precision=10, scale=0)
    public long getTxnamountmax() {
        return this.txnamountmax;
    }
    
    public void setTxnamountmax(long txnamountmax) {
        this.txnamountmax = txnamountmax;
    }

    
    @Column(name="TXNAMOUNTMIN", nullable=false, precision=10, scale=0)
    public long getTxnamountmin() {
        return this.txnamountmin;
    }
    
    public void setTxnamountmin(long txnamountmin) {
        this.txnamountmin = txnamountmin;
    }

    
    @Column(name="TXNLIMIT", nullable=false, precision=10, scale=0)
    public long getTxnlimit() {
        return this.txnlimit;
    }
    
    public void setTxnlimit(long txnlimit) {
        this.txnlimit = txnlimit;
    }

    
    @Column(name="TXNNOMAX", nullable=false)
    public int getTxnnomax() {
        return this.txnnomax;
    }
    
    public void setTxnnomax(int txnnomax) {
        this.txnnomax = txnnomax;
    }




}

