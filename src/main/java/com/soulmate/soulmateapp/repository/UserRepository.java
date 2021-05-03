package com.soulmate.soulmateapp.repository;

import com.soulmate.soulmateapp.domain.SoulmateUser;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<SoulmateUser,Integer> {
}
