package com.vicky.TablePerClass.Entity;

import javax.persistence.Entity;

@Entity
public class FrontEndDeveloper extends Developer {

	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
