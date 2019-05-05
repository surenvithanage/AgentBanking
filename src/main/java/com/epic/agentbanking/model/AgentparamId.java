package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AgentparamId generated by hbm2java
 */
@Embeddable
public class AgentparamId  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 7729402146095555868L;
	private String agentcategory;
     private String txntype;

    public AgentparamId() {
    }

    public AgentparamId(String agentcategory, String txntype) {
       this.agentcategory = agentcategory;
       this.txntype = txntype;
    }
   


    @Column(name="AGENTCATEGORY", nullable=false, length=16)
    public String getAgentcategory() {
        return this.agentcategory;
    }
    
    public void setAgentcategory(String agentcategory) {
        this.agentcategory = agentcategory;
    }


    @Column(name="TXNTYPE", nullable=false, length=16)
    public String getTxntype() {
        return this.txntype;
    }
    
    public void setTxntype(String txntype) {
        this.txntype = txntype;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AgentparamId) ) return false;
		 AgentparamId castOther = ( AgentparamId ) other; 
         
		 return ( (this.getAgentcategory()==castOther.getAgentcategory()) || ( this.getAgentcategory()!=null && castOther.getAgentcategory()!=null && this.getAgentcategory().equals(castOther.getAgentcategory()) ) )
 && ( (this.getTxntype()==castOther.getTxntype()) || ( this.getTxntype()!=null && castOther.getTxntype()!=null && this.getTxntype().equals(castOther.getTxntype()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAgentcategory() == null ? 0 : this.getAgentcategory().hashCode() );
         result = 37 * result + ( getTxntype() == null ? 0 : this.getTxntype().hashCode() );
         return result;
   }   


}


