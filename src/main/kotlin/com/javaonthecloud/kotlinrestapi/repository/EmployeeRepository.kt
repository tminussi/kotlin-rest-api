package com.javaonthecloud.kotlinrestapi.repository

import com.javaonthecloud.kotlinrestapi.model.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {

    fun findByEmail(email: String): Employee

    fun findByCpf(cpf: String): Employee
}