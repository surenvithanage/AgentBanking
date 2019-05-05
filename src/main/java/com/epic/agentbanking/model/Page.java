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
 * Page generated by hbm2java
 */
@Entity
@Table(name="page"
    ,catalog="abdev01"
)
public class Page  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 323800761642059049L;
	private String pagecode;
     private Status status;
     private Date createdtime;
     private String description;
     private Boolean dualauth;
     private Date lastupdatedtime;
     private String lastupdateduser;
     private Short sortkey;
     private String url;
     private Set<Pagetask> pagetasks = new HashSet<Pagetask>(0);
     private Set<Pagesectionuserrole> pagesectionuserroles = new HashSet<Pagesectionuserrole>(0);
     private Set<Tmpauthrec> tmpauthrecs = new HashSet<Tmpauthrec>(0);
     private Set<Pagetaskuserrole> pagetaskuserroles = new HashSet<Pagetaskuserrole>(0);

    public Page() {
    }

	
    public Page(String pagecode, Status status) {
        this.pagecode = pagecode;
        this.status = status;
    }
    public Page(String pagecode, Status status, Date createdtime, String description, Boolean dualauth, Date lastupdatedtime, String lastupdateduser, Short sortkey, String url, Set<Pagetask> pagetasks, Set<Pagesectionuserrole> pagesectionuserroles, Set<Tmpauthrec> tmpauthrecs, Set<Pagetaskuserrole> pagetaskuserroles) {
       this.pagecode = pagecode;
       this.status = status;
       this.createdtime = createdtime;
       this.description = description;
       this.dualauth = dualauth;
       this.lastupdatedtime = lastupdatedtime;
       this.lastupdateduser = lastupdateduser;
       this.sortkey = sortkey;
       this.url = url;
       this.pagetasks = pagetasks;
       this.pagesectionuserroles = pagesectionuserroles;
       this.tmpauthrecs = tmpauthrecs;
       this.pagetaskuserroles = pagetaskuserroles;
    }
   
     @Id 

    
    @Column(name="PAGECODE", unique=true, nullable=false, length=16)
    public String getPagecode() {
        return this.pagecode;
    }
    
    public void setPagecode(String pagecode) {
        this.pagecode = pagecode;
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
    @Column(name="CREATEDTIME", length=19)
    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    
    @Column(name="DESCRIPTION", length=64)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="DUALAUTH")
    public Boolean getDualauth() {
        return this.dualauth;
    }
    
    public void setDualauth(Boolean dualauth) {
        this.dualauth = dualauth;
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

    
    @Column(name="SORTKEY")
    public Short getSortkey() {
        return this.sortkey;
    }
    
    public void setSortkey(Short sortkey) {
        this.sortkey = sortkey;
    }

    
    @Column(name="URL", length=200)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="page")
    public Set<Pagetask> getPagetasks() {
        return this.pagetasks;
    }
    
    public void setPagetasks(Set<Pagetask> pagetasks) {
        this.pagetasks = pagetasks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="page")
    public Set<Pagesectionuserrole> getPagesectionuserroles() {
        return this.pagesectionuserroles;
    }
    
    public void setPagesectionuserroles(Set<Pagesectionuserrole> pagesectionuserroles) {
        this.pagesectionuserroles = pagesectionuserroles;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="page")
    public Set<Tmpauthrec> getTmpauthrecs() {
        return this.tmpauthrecs;
    }
    
    public void setTmpauthrecs(Set<Tmpauthrec> tmpauthrecs) {
        this.tmpauthrecs = tmpauthrecs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="page")
    public Set<Pagetaskuserrole> getPagetaskuserroles() {
        return this.pagetaskuserroles;
    }
    
    public void setPagetaskuserroles(Set<Pagetaskuserrole> pagetaskuserroles) {
        this.pagetaskuserroles = pagetaskuserroles;
    }




}


