package com.claudionogueira.course.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claudionogueira.course.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Brown", "maria@email.com");
		User alex = new User("2", "Alex Green", "alex@email.com");

		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));

		return ResponseEntity.ok().body(list);
	}
}
