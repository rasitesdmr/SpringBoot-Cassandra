package com.example.springbootcassandra.repository;

import com.example.springbootcassandra.model.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CassandraRepository<Student,Integer> {
}
