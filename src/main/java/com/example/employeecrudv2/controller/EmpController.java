package com.example.employeecrudv2.controller;

import com.example.employeecrudv2.model.Employee;
import com.example.employeecrudv2.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmpController {

    private final EmpService empServiceImpl;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return empServiceImpl.getAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return empServiceImpl.getEmployeeId(id);
    }

    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable Long id) {
        try {
            empServiceImpl.delete(id);
            System.out.println("Удалено успешно");
        } catch (Exception e) {
            System.out.println("Ошибка при удалении");
        }

    }

    @PostMapping("/employee")
    public Employee addNweEmployee(@RequestBody Employee employee) {
        return empServiceImpl.save(employee);

    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return empServiceImpl.save(employee);
    }
}
