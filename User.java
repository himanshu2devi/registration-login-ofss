package com.himanshu.springboot.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="fname")
	private String FName;
	
	@Column(name="lname")
	private String Lname;
	
	
	@Column(name="email",unique=true)
	private String email;
	
	
	@Column(name="password",unique=true)
	private String Password;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
			name="user_roles",
					joinColumns=@JoinColumn(
					name="user_id",referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(
					name="role_id",referencedColumnName="id"))
					
	private Collection<Role> roles;
	
	public User() {}
	
	
	public User(String fname, String lname, String email, String password, Collection<Role> roles) {
		super();
		this.id = id;
		FName = fname;
		Lname = lname;
		this.email = email;
		Password = password;
		this.roles = roles;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fname) {
		FName = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	
	

}
