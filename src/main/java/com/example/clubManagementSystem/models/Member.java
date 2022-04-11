package com.example.clubManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="members")
public class Member {
    private String id;
    private String fullName;
    private String email;
    private Boolean membership;
    private String image;
}
