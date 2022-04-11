package com.example.clubManagementSystem.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="managers")
public class Manager {
    private String id;
    private String fullName;
    private Title title;
    private String username;
    private String email;
    private String resetToken;
    private String validationToken;
    private String image;


}
