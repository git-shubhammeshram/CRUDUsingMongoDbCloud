package com.coderandrider.DTO;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserDTO {
	@Id
	private String userID;
	private String userName;
	private String userEmail;
	private String userPassword;

}
