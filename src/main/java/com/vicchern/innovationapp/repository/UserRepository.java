package com.vicchern.innovationapp.repository;

import com.vicchern.innovationapp.entity.impl.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
