package com.example.clubManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection="affintyGroups")
public class AffinityGroup
{
    private String id;
    private String title;
    private String description;
    private List<Member> bureau;
}
