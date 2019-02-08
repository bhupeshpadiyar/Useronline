package com.org.nic.contract;

import org.springframework.data.repository.CrudRepository;

import com.org.nic.entity.UserProfile;

public interface UserRepository extends CrudRepository<UserProfile, String> {

}
