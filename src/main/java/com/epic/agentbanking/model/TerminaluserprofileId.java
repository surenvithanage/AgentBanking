package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TerminaluserprofileId generated by hbm2java
 */
@Embeddable
public class TerminaluserprofileId  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 6877674086263001324L;
	private String transactiontype;
     private String userrole;

    public TerminaluserprofileId() {
    }

    public TerminaluserprofileId(String transactiontype, String userrole) {
       this.transactiontype = transactiontype;
       this.userrole = userrole;
    }
   


    @Column(name="TRANSACTIONTYPE", nullable=false, length=16)
    public String getTransactiontype() {
        return this.transactiontype;
    }
    
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }


    @Column(name="USERROLE", nullable=false, length=16)
    public String getUserrole() {
        return this.userrole;
    }
    
    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TerminaluserprofileId) ) return false;
		 TerminaluserprofileId castOther = ( TerminaluserprofileId ) other; 
         
		 return ( (this.getTransactiontype()==castOther.getTransactiontype()) || ( this.getTransactiontype()!=null && castOther.getTransactiontype()!=null && this.getTransactiontype().equals(castOther.getTransactiontype()) ) )
 && ( (this.getUserrole()==castOther.getUserrole()) || ( this.getUserrole()!=null && castOther.getUserrole()!=null && this.getUserrole().equals(castOther.getUserrole()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTransactiontype() == null ? 0 : this.getTransactiontype().hashCode() );
         result = 37 * result + ( getUserrole() == null ? 0 : this.getUserrole().hashCode() );
         return result;
   }   


}


