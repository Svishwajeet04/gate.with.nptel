package com.vishwa.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.vishwa.entities.enums.Stream;

import lombok.Data;
@Entity
@Data
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;
	private int active;
	private Date date;

	@Column(unique = true)
	private String email;

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	private String name;

	private String pass;

	private String role;

	private Stream stream;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY, targetEntity = UserData.class)
	private UserData udata;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return pass;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
