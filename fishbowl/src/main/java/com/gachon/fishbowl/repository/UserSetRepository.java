package com.gachon.fishbowl.repository;

import com.gachon.fishbowl.entity.UserSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSetRepository extends JpaRepository<UserSet,Long> {
}
