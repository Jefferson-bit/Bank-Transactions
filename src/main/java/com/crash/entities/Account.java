package com.crash.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "tb_account")
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	private String name;
	private String password;
	@Column(unique = true)
	private String email;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_user_role",
	joinColumns =  @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	
	public Account() {
	}

	public Account(Long accountId, String name, String password, String email) {
		this.accountId = accountId;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Long getId() {
		return accountId;
	}

	public void setId(Long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		return true;
	}

}
