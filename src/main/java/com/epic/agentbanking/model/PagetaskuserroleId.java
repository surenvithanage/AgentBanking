package com.epic.agentbanking.model;
// Generated May 3, 2019 4:22:22 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PagetaskuserroleId generated by hbm2java
 */
@Embeddable
public class PagetaskuserroleId  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 6308964636110248237L;
	private String page;
     private String task;
     private String userrole;

    public PagetaskuserroleId() {
    }

    public PagetaskuserroleId(String page, String task, String userrole) {
       this.page = page;
       this.task = task;
       this.userrole = userrole;
    }
   


    @Column(name="PAGE", nullable=false, length=16)
    public String getPage() {
        return this.page;
    }
    
    public void setPage(String page) {
        this.page = page;
    }


    @Column(name="TASK", nullable=false, length=16)
    public String getTask() {
        return this.task;
    }
    
    public void setTask(String task) {
        this.task = task;
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
		 if ( !(other instanceof PagetaskuserroleId) ) return false;
		 PagetaskuserroleId castOther = ( PagetaskuserroleId ) other; 
         
		 return ( (this.getPage()==castOther.getPage()) || ( this.getPage()!=null && castOther.getPage()!=null && this.getPage().equals(castOther.getPage()) ) )
 && ( (this.getTask()==castOther.getTask()) || ( this.getTask()!=null && castOther.getTask()!=null && this.getTask().equals(castOther.getTask()) ) )
 && ( (this.getUserrole()==castOther.getUserrole()) || ( this.getUserrole()!=null && castOther.getUserrole()!=null && this.getUserrole().equals(castOther.getUserrole()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPage() == null ? 0 : this.getPage().hashCode() );
         result = 37 * result + ( getTask() == null ? 0 : this.getTask().hashCode() );
         result = 37 * result + ( getUserrole() == null ? 0 : this.getUserrole().hashCode() );
         return result;
   }   


}


