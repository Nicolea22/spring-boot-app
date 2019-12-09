package com.leandro.app.controller;

import com.leandro.app.controller.converters.UserConverter;
import com.leandro.app.controller.exceptions.UserNotFoundException;
import com.leandro.app.controller.responses.UserDTO;
import com.leandro.app.controller.responses.UserWithLoansDTO;
import com.leandro.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserConverter userConverter;

	@PostMapping
	@ResponseBody
	public Long create(@RequestBody UserDTO userDTO) {
		return userService.save(userConverter.convertToUser(userDTO)).getId();
	}

	@DeleteMapping(path = "/{id}")
	@ResponseBody
	public void delete(@PathVariable Long id) {
		userService.deleteById(id);
	}

	@GetMapping(path = "/{id}", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public UserWithLoansDTO getUser(@PathVariable Long id) {
		return userConverter.convertToUserDTO(userService.findById(id).orElseThrow(UserNotFoundException::new));
	}

}
