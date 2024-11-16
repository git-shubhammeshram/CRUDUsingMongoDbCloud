package com.coderandrider.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

	@Id
	private String userID;
	private String userName;
	private String userEmail;
	private String userPassword;


}
