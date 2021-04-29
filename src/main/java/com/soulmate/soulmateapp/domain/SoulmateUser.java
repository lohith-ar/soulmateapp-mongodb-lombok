package com.soulmate.soulmateapp.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Document(collection = "soulmateuser")
public class SoulmateUser {
    private int id;
    private int age;
    private String name;
    private String gender;



}
