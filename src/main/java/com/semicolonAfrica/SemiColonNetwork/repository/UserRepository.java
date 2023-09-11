package com.semicolonAfrica.SemiColonNetwork.repository;

import com.semicolonAfrica.SemiColonNetwork.models.User;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
