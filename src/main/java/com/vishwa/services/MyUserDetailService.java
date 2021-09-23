package com.vishwa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vishwa.entities.User;
import com.vishwa.repo.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails d = null;
		Optional<User> u = userRepo.findByEmail(username);
		if (u.isPresent())
			d = u.get();
		else {
			throw new UsernameNotFoundException(username);
		}
		return d;
	}

}
