package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Employee
import com.javaonthecloud.kotlinrestapi.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(
        private val employeeRepository: EmployeeRepository
) {

    fun findAll(email: String, cpf: String): Collection<Employee> {
        if (email.isNotBlank()) {
            return findByEmail(email)
        } else if (cpf.isNotBlank()) {
            return findByCpf(cpf)
        }
        return employeeRepository.findAll()
    }

    private fun findByEmail(email: String): Collection<Employee> = employeeRepository.findByEmail(email)

    private fun findByCpf(cpf: String): Collection<Employee> = employeeRepository.findByCpf(cpf)

    fun save(employee: Employee): Employee = employeeRepository.save(employee)
}