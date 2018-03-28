package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.enums.TypeEnum
import com.javaonthecloud.kotlinrestapi.model.Entry
import com.javaonthecloud.kotlinrestapi.repository.EntryRepository
import org.junit.Test

import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.runners.MockitoJUnitRunner
import org.springframework.data.domain.PageRequest
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class EntryServiceTest {

    @InjectMocks
    private val entryService: EntryService? = null

    @Mock
    private val entryRepository: EntryRepository? = null

    @Test
    fun findByEmployeeId() {
        val pageRequest = PageRequest(0, 10)
        entryService?.findByEmployeeId("123", pageRequest)
        Mockito.verify(entryRepository, Mockito.times(1))?.findByEmployeeId("123", pageRequest)
    }

    @Test
    fun save() {
        val registry = Entry("1", Date(), TypeEnum.INICIO, "123")
        `when`(entryRepository?.save(registry)).thenReturn(registry)
        entryService?.save(registry)
        Mockito.verify(entryRepository, Mockito.times(1))?.save(registry)
    }
}