package com.example.studentCRUD.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class tbl_Login {
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String user_name;
    private String user_password;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public tbl_Login(Long id, String user_name, String user_password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_password = user_password;
	}

	public tbl_Login() {
		super();
		// TODO Auto-generated constructor stub
	}

}

