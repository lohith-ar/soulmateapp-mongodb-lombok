package com.soulmate.soulmateapp.repository;

import com.soulmate.soulmateapp.domain.SoulmateUser;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<SoulmateUser,Integer> {

//    @Query("FROM SoulmateUser WHERE gender=:gender1")
//    List<SoulmateUser> getUsersByGender(@Param("gender1") String gender);
//
//    @Query("FROM SoulmateUser WHERE age=:age1")
//    List<SoulmateUser> getUsersByAge(@Param("age1") int age);
//
//    @Query("FROM SoulmateUser WHERE name=:name1")
//    List<SoulmateUser> getUsersByName(@Param("name1") String name);

}
