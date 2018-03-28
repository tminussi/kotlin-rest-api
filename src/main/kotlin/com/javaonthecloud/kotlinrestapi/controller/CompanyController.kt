package com.javaonthecloud.kotlinrestapi.controller

import com.javaonthecloud.kotlinrestapi.model.Company
import com.javaonthecloud.kotlinrestapi.service.CompanyService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/companies")
class CompanyController(
        private val companyService: CompanyService
) {

    @PostMapping
    fun create(@RequestBody company: Company): Company = companyService.save(company)

    @GetMapping
    fun findAll(cnpj: String): List<Company> = companyService.findAll(cnpj)
}