package com.example.employeecrudv2.service;

import com.example.employeecrudv2.model.Employee;
import com.example.employeecrudv2.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeId(Long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        return opt.orElse(null);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
