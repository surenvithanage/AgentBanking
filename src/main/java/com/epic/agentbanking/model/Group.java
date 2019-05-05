package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Group generated by hbm2java
 */
@Entity
@Table(name="group"
    ,catalog="abdev01"
)
public class Group  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -5712839669693677297L;
	private Long id;
     private Cluster cluster;
     private Status status;
     private String groupdetails;
     private Date createdtime;
     private Date lastupdatedtime;
     private String lastupdateduser;
     private Set<Member> members = new HashSet<Member>(0);

    public Group() {
    }

	
    public Group(Status status) {
        this.status = status;
    }
    public Group(Cluster cluster, Status status, String groupdetails, Date createdtime, Date lastupdatedtime, String lastupdateduser, Set<Member> members) {
       this.cluster = cluster;
       this.status = status;
       this.groupdetails = groupdetails;
       this.createdtime = createdtime;
       this.lastupdatedtime = lastupdatedtime;
       this.lastupdateduser = lastupdateduser;
       this.members = members;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLUSTER")
    public Cluster getCluster() {
        return this.cluster;
    }
    
    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STATUS", nullable=false)
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }

    
    @Column(name="GROUPDETAILS", length=128)
    public String getGroupdetails() {
        return this.groupdetails;
    }
    
    public void setGroupdetails(String groupdetails) {
        this.groupdetails = groupdetails;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="group")
    public Set<Member> getMembers() {
        return this.members;
    }
    
    public void setMembers(Set<Member> members) {
        this.members = members;
    }




}


