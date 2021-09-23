package com.vishwa.client.services;

import java.util.Date;
import java.util.LinkedList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.vishwa.dtos.AuthenticationRequest;
import com.vishwa.dtos.AuthenticationResponse;
import com.vishwa.dtos.UserRegisterDto;
import com.vishwa.entities.User;
import com.vishwa.entities.UserData;
import com.vishwa.repo.UserDataRepository;
import com.vishwa.repo.UserRepository;
import com.vishwa.services.IdGenerators;
import com.vishwa.services.JwtUtilService;

@Service
public class LoginService {
	@Autowired
	UserRepository urepo;

	@Autowired
	UserDataRepository udrepo;

	@Autowired
	IdGenerators ids;

	@Autowired
	private JwtUtilService jwtutil;

	@Autowired
	private UserDetailsService userDetailsService;

	public AuthenticationResponse createAuthenticationToken(AuthenticationRequest ar) {

		UserDetails ud = userDetailsService.loadUserByUsername(ar.getEmail());
		final String jwt = jwtutil.createToken(ar.getEmail(), new LinkedList<String>());
		AuthenticationResponse ar1 = new AuthenticationResponse(jwt, ((User) ud).getRole());
		return ar1;
	}

	public UserRegisterDto createUser(UserRegisterDto user) {
		if (urepo.findByEmail(user.getEmail()).isEmpty()) {
			User u = user.toUser();
			boolean b = true;
			String k = null;
			while (b) {
				k = ids.uidgenerator();
				Optional<User> t = urepo.findById(k);
				if (t.isEmpty())
					b = false;
			}
			u.setId(k);
			u.setDate(new Date());
			urepo.save(u);
			UserData ud = new UserData();
			ud.setId(k);
			ud.setUser(u);
			udrepo.save(ud);
			return user;
		} else {
			return null;
		}

	}

}
