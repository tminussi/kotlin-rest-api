package com.javaonthecloud.kotlinrestapi.controller

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
    fun getAll(@RequestParam(required = false, defaultValue = "") email: String,
               @RequestParam(required = false, defaultValue = "") cpf: String,
               @RequestParam(required = false, defaultValue = "1") size: Int,
               @RequestParam(required = false, defaultValue = "0") page: Int): Collection<Employee> = employeeService.findAll(email, cpf)
}