package controller;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


@Entity
public class Student {
    

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
	
    private String userName;
   
    @ElementCollection
    // not mandatory
    @JoinTable(name="list_skills",
    		joinColumns = @JoinColumn(name="User_Id"))
    private Set<Skills> listOfSkills=new HashSet<>();
    
    
	public Set<Skills> getListOfSkills() {
		return listOfSkills;
	}

	public void setListOfSkills(Set<Skills> listOfSkills) {
		this.listOfSkills = listOfSkills;
	}

	public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

	@Override
	public String toString() {
		return "Student [userId=" + userId + ", userName=" + userName + ", listOfSkills=" + listOfSkills
				+ ", getListOfSkills()=" + getListOfSkills() + ", getUserId()=" + getUserId() + ", getUserName()="
				+ getUserName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

    
}
