package com.training.olxlogin.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxlogin.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

	@Query(value = "SELECT * from users where username=? and password=?", nativeQuery = true)
	Users findUserByUsernameAndPassword(String username, String password);
}
