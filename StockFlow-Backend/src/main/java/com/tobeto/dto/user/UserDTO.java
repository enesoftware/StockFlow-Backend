package com.tobeto.dto.user;

import lombok.Data;

@Data
public class UserDTO {

	private String email;
	private String name;
	private String lastName;
	private String password;
	private int roleId;
}
