package com.ecommerce.users.repository;

import com.ecommerce.users.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
