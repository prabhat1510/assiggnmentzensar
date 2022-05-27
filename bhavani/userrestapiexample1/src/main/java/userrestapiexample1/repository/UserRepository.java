package userrestapiexample1.repository;

import org.springframework.data.repository.CrudRepository;


import userrestapiexample1.entities.User;


public interface UserRepository extends CrudRepository<User,Integer>{

}
