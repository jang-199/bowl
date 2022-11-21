package com.gachon.fishbowl.repository;

import com.gachon.fishbowl.entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserIdRepository extends JpaRepository<UserId,String> {
}
