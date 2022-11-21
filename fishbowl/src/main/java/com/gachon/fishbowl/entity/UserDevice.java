package com.gachon.fishbowl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class UserDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @Column(name = "USER_ID")
    private UserId userId;

    @ManyToOne
    @Column(name = "DEVICE_ID")
    private DeviceId deviceId;
}
