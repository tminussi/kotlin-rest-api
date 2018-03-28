package com.javaonthecloud.kotlinrestapi.repository

import com.javaonthecloud.kotlinrestapi.model.Company
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : MongoRepository<Company, String> {

    fun findAllByCnpj(cnpj: String): List<Company>
}