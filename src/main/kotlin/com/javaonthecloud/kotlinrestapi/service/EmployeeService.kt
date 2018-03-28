package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Employee
import com.javaonthecloud.kotlinrestapi.repository.EmployeeRepository

class EmployeeService(
        val employeeRepository: EmployeeRepository
) {

    fun findByEmail(email: String): Employee = employeeRepository.findByEmail(email)

    fun findByCpf(cpf: String): Employee = employeeRepository.findByCpf(cpf)

    fun save(employee: Employee): Employee = employeeRepository.save(employee)
}