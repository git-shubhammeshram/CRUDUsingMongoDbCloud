package com.coderandrider.Services;

import com.coderandrider.DTO.UserDTO;
import com.coderandrider.Entity.User;
import com.coderandrider.Exception.ResourceNotFoundException;
import com.coderandrider.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String saveUser(UserDTO userDTO) {
		User user = convertEntity(userDTO);
		User savedUser = userRepository.save(user);
		convertDTO(savedUser);
		return "User saved successfully";
	}

	public List<UserDTO> getAllUsers() {
		return userRepository.findAll().stream()
				.map(this::convertDTO)
				.toList();
	}

	public UserDTO getUserByID(String userID) {
		return userRepository.findById(userID)
				.map(this::convertDTO)
				.orElseThrow(()-> new ResourceNotFoundException("User not found"));
	}

	public String updateUser(String userID, User user){
		User exitsUser = userRepository.findById(userID).orElseThrow(() -> new ResourceNotFoundException("User not found"));
		exitsUser.setUserName(user.getUserName());
		exitsUser.setUserEmail(user.getUserEmail());
		User updatedUser = userRepository.save(exitsUser);
		convertDTO(updatedUser);
		return "User updated successfully";
	}

	public String deleteUser(String userID) {
        userRepository.deleteById(userID);
        return "User deleted successfully";
    }

	public UserDTO convertDTO(User user){
		UserDTO userDTO = new UserDTO();
        userDTO.setUserID(user.getUserID());
        userDTO.setUserName(user.getUserName());
        userDTO.setUserEmail(user.getUserEmail());
		userDTO.setUserPassword(user.getUserPassword());
        return userDTO;
	}

	public User convertEntity(UserDTO userDTO){
		User user = new User();
        user.setUserID(userDTO.getUserID());
        user.setUserName(userDTO.getUserName());
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserPassword(userDTO.getUserPassword());
        return user;
	}

}
