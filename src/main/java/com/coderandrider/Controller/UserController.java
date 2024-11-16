package com.coderandrider.Controller;

import com.coderandrider.DTO.UserDTO;
import com.coderandrider.Entity.User;
import com.coderandrider.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<String> saveUserHandler(@RequestBody UserDTO user){
		String response = userService.saveUser(user);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserDTO> getUserByIdHandler(@PathVariable String userId){
		UserDTO user = userService.getUserByID(userId);
        if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<Iterable<UserDTO>> getAllUsersHandler(){
        Iterable<UserDTO> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

	@PutMapping("update/{userId}")
	public ResponseEntity<String> updateUser(@PathVariable String userId, @RequestBody User user){
		String response = userService.updateUser(userId, user);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable String userId){
        String response = userService.deleteUser(userId);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }


}
