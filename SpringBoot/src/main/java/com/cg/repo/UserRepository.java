package com.cg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	
	
}
