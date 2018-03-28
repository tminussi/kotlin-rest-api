package com.javaonthecloud.kotlinrestapi.repository

import com.javaonthecloud.kotlinrestapi.model.Employee
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : MongoRepository<Employee, String> {

    fun findByEmail(email: String): Collection<Employee>

    fun findByCpf(cpf: String): Collection<Employee>
}