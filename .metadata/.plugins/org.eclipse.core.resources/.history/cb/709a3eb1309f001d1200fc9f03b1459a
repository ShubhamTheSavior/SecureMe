package com.secureme.rest;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/validateToken")
public class ConnectionValidatorResource {

	
	public class ConnValidationResponse {
		private String status;
		private boolean isAuthenticated;
		private String methodType;
		private String username;
		private List<GrantedAuthority> authorities;
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public boolean isAuthenticated() {
			return isAuthenticated;
		}
		public void setAuthenticated(boolean isAuthenticated) {
			this.isAuthenticated = isAuthenticated;
		}
		public String getMethodType() {
			return methodType;
		}
		public void setMethodType(String methodType) {
			this.methodType = methodType;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public List<GrantedAuthority> getAuthorities() {
			return authorities;
		}
		public void setAuthorities(List<GrantedAuthority> authorities) {
			this.authorities = authorities;
		}
		
		
	}

}
