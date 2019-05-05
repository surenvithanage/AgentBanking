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
 * Usersbranch generated by hbm2java
 */
@Entity
@Table(name="usersbranch"
    ,catalog="abdev01"
)
public class Usersbranch  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 2565737347562293216L;
	private UsersbranchId id;
     private Branch branch;
     private Users users;
     private Date createdtime;
     private String lastupdateduser;

    public Usersbranch() {
    }

	
    public Usersbranch(UsersbranchId id, Branch branch, Users users) {
        this.id = id;
        this.branch = branch;
        this.users = users;
    }
    public Usersbranch(UsersbranchId id, Branch branch, Users users, Date createdtime, String lastupdateduser) {
       this.id = id;
       this.branch = branch;
       this.users = users;
       this.createdtime = createdtime;
       this.lastupdateduser = lastupdateduser;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="branch", column=@Column(name="BRANCH", nullable=false, length=16) ), 
        @AttributeOverride(name="username", column=@Column(name="USERNAME", nullable=false, length=50) ) } )
    public UsersbranchId getId() {
        return this.id;
    }
    
    public void setId(UsersbranchId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BRANCH", nullable=false, insertable=false, updatable=false)
    public Branch getBranch() {
        return this.branch;
    }
    
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USERNAME", nullable=false, insertable=false, updatable=false)
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATEDTIME", length=19)
    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    
    @Column(name="LASTUPDATEDUSER", length=64)
    public String getLastupdateduser() {
        return this.lastupdateduser;
    }
    
    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }




}

