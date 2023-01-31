package com.secureme.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", nullable = false, unique = true, updatable = false)
	private Integer roleId;
	
	private String roleName;
	
	@ManyToMany(mappedBy = "roles")
	Set<UserInfo> userInfo= new HashSet<>();
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Set<UserInfo> getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(Set<UserInfo> userInfo) {
		this.userInfo = userInfo;
	}
	
	
}
