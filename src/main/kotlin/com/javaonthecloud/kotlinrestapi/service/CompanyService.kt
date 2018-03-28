package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Company
import com.javaonthecloud.kotlinrestapi.repository.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(
        val companyRepository: CompanyRepository
) {

    fun save(company: Company): Company = companyRepository.save(company)

    fun findAll(cnpj: String): List<Company> {
        if (cnpj.isBlank()) {
            return companyRepository.findAll()
        }
        return companyRepository.findAllByCnpj(cnpj)
    }

}