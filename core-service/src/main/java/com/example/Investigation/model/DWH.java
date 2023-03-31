package com.example.Investigation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "dwh")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DWH {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @MapsId("actionId")
    @JoinColumn(name = "ACTION_ID", nullable = false)
    private Action action;

    private Date actionTime;
}
