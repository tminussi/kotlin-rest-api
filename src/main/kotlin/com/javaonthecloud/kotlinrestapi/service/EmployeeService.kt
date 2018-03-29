package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.controller.filter.EmployeeFilter
import com.javaonthecloud.kotlinrestapi.model.Employee
import com.javaonthecloud.kotlinrestapi.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(
        private val employeeRepository: EmployeeRepository
) {

    fun findAll(filter: EmployeeFilter): Collection<Employee> {
        if (filter.email.isNotBlank()) {
            return findByEmail(filter.email)
        } else if (filter.cpf.isNotBlank()) {
            return findByCpf(filter.cpf)
        }
        return employeeRepository.findAll()
    }

    private fun findByEmail(email: String): Collection<Employee> = employeeRepository.findByEmail(email)

    private fun findByCpf(cpf: String): Collection<Employee> = employeeRepository.findByCpf(cpf)

    fun save(employee: Employee): Employee = employeeRepository.save(employee)
}