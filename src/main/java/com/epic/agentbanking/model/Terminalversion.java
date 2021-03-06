package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Terminalversion generated by hbm2java
 */
@Entity
@Table(name="terminalversion"
    ,catalog="abdev01"
)
public class Terminalversion  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 3211560794132351854L;
	private String versionid;
     private Status status;
     private Date createtime;
     private String description;
     private Date effectivedate;
     private Date lastupdatedtime;
     private String lastupdateduser;
     private Set<Terminal> terminals = new HashSet<Terminal>(0);

    public Terminalversion() {
    }

	
    public Terminalversion(String versionid, Status status, String description, Date effectivedate) {
        this.versionid = versionid;
        this.status = status;
        this.description = description;
        this.effectivedate = effectivedate;
    }
    public Terminalversion(String versionid, Status status, Date createtime, String description, Date effectivedate, Date lastupdatedtime, String lastupdateduser, Set<Terminal> terminals) {
       this.versionid = versionid;
       this.status = status;
       this.createtime = createtime;
       this.description = description;
       this.effectivedate = effectivedate;
       this.lastupdatedtime = lastupdatedtime;
       this.lastupdateduser = lastupdateduser;
       this.terminals = terminals;
    }
   
     @Id 

    
    @Column(name="VERSIONID", unique=true, nullable=false, length=8)
    public String getVersionid() {
        return this.versionid;
    }
    
    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STATUS", nullable=false)
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATETIME", length=19)
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    
    @Column(name="DESCRIPTION", nullable=false, length=64)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVEDATE", nullable=false, length=19)
    public Date getEffectivedate() {
        return this.effectivedate;
    }
    
    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="terminalversion")
    public Set<Terminal> getTerminals() {
        return this.terminals;
    }
    
    public void setTerminals(Set<Terminal> terminals) {
        this.terminals = terminals;
    }




}


