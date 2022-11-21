package com.gachon.fishbowl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeviceId {
    @Id
    @Column(name = "DEVICE_ID")
    private Long id;
}
