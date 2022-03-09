package com.te.exm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Players {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String userName;
	private String emailId;
	private String passWord;
	private String nativePlace;
	

}
