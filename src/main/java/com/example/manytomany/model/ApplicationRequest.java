package com.example.manytomany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "commentary", columnDefinition = "TEXT")
    private String commentary;

    @Column(name = "phoneNumber")
    private String phone;

    @Column(name="handled")
    private boolean handled;

    @ManyToOne
    private Courses course;

    @ManyToMany
    private List<Operators> operators;
}
