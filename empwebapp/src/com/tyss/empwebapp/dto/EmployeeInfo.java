package com.tyss.empwebapp.dto;

import lombok.Data;

@Data //generate all getters and setters
public class EmployeeInfo {
private int id;
private String name;
private String email;
private String password;
}
