package com.javaonthecloud.kotlinrestapi.repository

import com.javaonthecloud.kotlinrestapi.model.Entry
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EntryRepository : MongoRepository<Entry, String> {

    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Entry>
}