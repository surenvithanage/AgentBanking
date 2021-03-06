package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Response generated by hbm2java
 */
@Entity
@Table(name="response"
    ,catalog="abdev01"
)
public class Response  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 7735878332578214470L;
	private String responsecode;
     private String description;
     private String t24description;

    public Response() {
    }

	
    public Response(String responsecode) {
        this.responsecode = responsecode;
    }
    public Response(String responsecode, String description, String t24description) {
       this.responsecode = responsecode;
       this.description = description;
       this.t24description = t24description;
    }
   
     @Id 

    
    @Column(name="RESPONSECODE", unique=true, nullable=false, length=10)
    public String getResponsecode() {
        return this.responsecode;
    }
    
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    
    @Column(name="DESCRIPTION", length=128)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="T24DESCRIPTION", length=256)
    public String getT24description() {
        return this.t24description;
    }
    
    public void setT24description(String t24description) {
        this.t24description = t24description;
    }




}


