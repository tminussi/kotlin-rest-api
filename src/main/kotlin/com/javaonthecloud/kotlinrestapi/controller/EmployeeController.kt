package com.javaonthecloud.kotlinrestapi.controller

import com.javaonthecloud.kotlinrestapi.controller.filter.EmployeeFilter
import com.javaonthecloud.kotlinrestapi.model.Employee
import com.javaonthecloud.kotlinrestapi.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeeController(
        private val employeeService: EmployeeService
) {

    @PostMapping
    fun create(@RequestBody employee: Employee): Employee = employeeService.save(employee)

    @GetMapping
    fun getAll(filter: EmployeeFilter): Collection<Employee> = employeeService.findAll(filter)
}