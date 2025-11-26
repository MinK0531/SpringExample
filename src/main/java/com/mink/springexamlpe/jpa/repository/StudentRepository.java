package com.mink.springexamlpe.jpa.repository;

import com.mink.springexamlpe.jpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



}
