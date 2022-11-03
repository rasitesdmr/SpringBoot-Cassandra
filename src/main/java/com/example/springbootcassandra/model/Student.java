package com.example.springbootcassandra.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Getter
@Setter
@Table
public class Student {

    @PrimaryKey
    private int studentNumber;

    private String firstName;

    private String lastName;

    private String email;
}
