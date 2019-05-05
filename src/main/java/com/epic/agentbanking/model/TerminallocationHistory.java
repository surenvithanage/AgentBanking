package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TerminallocationHistory generated by hbm2java
 */
@Entity
@Table(name="terminallocation_history"
    ,catalog="abdev01"
)
public class TerminallocationHistory  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1034809798877498242L;
	private Long id;
     private Agentuser agentuser;
     private Terminal terminal;
     private Date createdtime;
     private String latitude;
     private String longitude;

    public TerminallocationHistory() {
    }

	
    public TerminallocationHistory(Agentuser agentuser, Terminal terminal, String latitude, String longitude) {
        this.agentuser = agentuser;
        this.terminal = terminal;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public TerminallocationHistory(Agentuser agentuser, Terminal terminal, Date createdtime, String latitude, String longitude) {
       this.agentuser = agentuser;
       this.terminal = terminal;
       this.createdtime = createdtime;
       this.latitude = latitude;
       this.longitude = longitude;
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
    @JoinColumn(name="AGENTUSER", nullable=false)
    public Agentuser getAgentuser() {
        return this.agentuser;
    }
    
    public void setAgentuser(Agentuser agentuser) {
        this.agentuser = agentuser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TERMINALID", nullable=false)
    public Terminal getTerminal() {
        return this.terminal;
    }
    
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATEDTIME", length=19)
    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    
    @Column(name="LATITUDE", nullable=false, length=32)
    public String getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    
    @Column(name="LONGITUDE", nullable=false, length=32)
    public String getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }




}


