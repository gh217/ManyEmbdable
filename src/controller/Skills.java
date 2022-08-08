package controller;

import javax.persistence.Embeddable;

@Embeddable
public class Skills {
	
	
	private String skillName;
	
	public String getSkillName() {
		return skillName;
	}
	
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}
