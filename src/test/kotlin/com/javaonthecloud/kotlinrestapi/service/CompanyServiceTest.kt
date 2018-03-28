package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Company
import com.javaonthecloud.kotlinrestapi.repository.CompanyRepository
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CompanyServiceTest {

    @InjectMocks
    val companyService: CompanyService? = null

    @Mock
    val companyRepository: CompanyRepository? = null

    @Test
    fun findByCnpj() {
        val company = Company("1", "my company", "123")
        `when`(companyRepository?.findByCnpj("123")).thenReturn(company)
        assertEquals("123", company.cnpj)
        companyService?.findByCnpj("123")
        verify(companyRepository, times(1))?.findByCnpj("123")
    }

    @Test
    fun save() {
        val company = Company("1", "my company", "123")
        `when`(companyRepository?.save(company)).thenReturn(company)
        companyService?.save(company)
        verify(companyRepository, times(1))?.save(company)
    }
}