package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.enums.TypeEnum
import com.javaonthecloud.kotlinrestapi.model.Registry
import com.javaonthecloud.kotlinrestapi.repository.RegistryRepository
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.runners.MockitoJUnitRunner
import org.springframework.data.domain.PageRequest
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class RegistryServiceTest {

    @InjectMocks
    private val registryService: RegistryService? = null

    @Mock
    private val registryRepository: RegistryRepository? = null

    @Test
    fun findByEmployeeId() {
        val pageRequest = PageRequest(0, 10)
        registryService?.findByEmployeeId("123", pageRequest)
        Mockito.verify(registryRepository, Mockito.times(1))?.findByEmployeeId("123", pageRequest)
    }

    @Test
    fun save() {
        val registry = Registry("1", Date(), TypeEnum.INICIO, "123")
        `when`(registryRepository?.save(registry)).thenReturn(registry)
        registryService?.save(registry)
        Mockito.verify(registryRepository, Mockito.times(1))?.save(registry)
    }
}