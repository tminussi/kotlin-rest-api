package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Company
import com.javaonthecloud.kotlinrestapi.repository.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(
        val companyRepository: CompanyRepository
) {

    fun findByCnpj(cnpj: String): Company = companyRepository.findByCnpj(cnpj)

    fun save(company: Company): Company = companyRepository.save(company)

}