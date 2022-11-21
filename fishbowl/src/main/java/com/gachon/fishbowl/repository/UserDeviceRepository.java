package com.gachon.fishbowl.repository;

import com.gachon.fishbowl.entity.UserDevice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDeviceRepository extends JpaRepository<UserDevice,Long> {
}
