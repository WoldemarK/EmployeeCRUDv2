package com.example.employeecrudv2.repository;

import com.example.employeecrudv2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Transactional
    void deleteById(@NonNull Long id);

}
