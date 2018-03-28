package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.enums.ProfileEnum
import com.javaonthecloud.kotlinrestapi.model.Employee
import com.javaonthecloud.kotlinrestapi.repository.EmployeeRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class EmployeeServiceTest {

    @InjectMocks
    private val employeeService: EmployeeService? = null

    @Mock
    private val employeeRepository: EmployeeRepository? = null

    @Test
    fun findByEmail() {
        employeeService?.findByEmail("dummy@email.com")
        verify(employeeRepository, times(1))?.findByEmail("dummy@email.com")
    }

    @Test
    fun findByCpf() {
        employeeService?.findByCpf("12345678911")
        verify(employeeRepository, times(1))?.findByCpf("12345678911")
    }

    @Test
    fun save() {
        val employee = Employee("1", "name", "dummy@email.com", "password", "12345678911", ProfileEnum.ROLE_ADMIN,
                "123456", 30.90, 8.0, 1.0)
        `when`(employeeRepository?.save(employee)).thenReturn(employee)
        employeeService?.save(employee)
        Mockito.verify(employeeRepository, Mockito.times(1))?.save(employee)
    }
}