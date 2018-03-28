package com.javaonthecloud.kotlinrestapi.repository

import com.javaonthecloud.kotlinrestapi.model.Registry
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface RegistryRepository : MongoRepository<Registry, String> {

    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Registry>
}