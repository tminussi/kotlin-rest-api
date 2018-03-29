package com.javaonthecloud.kotlinrestapi.security

import com.javaonthecloud.kotlinrestapi.model.Employee
import com.javaonthecloud.kotlinrestapi.service.EmployeeService
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class EmployeeDetailsService(
        val employeeService: EmployeeService
) : UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        if (username != null) {
            val employee: Employee? = employeeService.findByEmail(username)
            if (employee != null) {
                return EmployeePrincipal(employee)
            }
        }
        throw UsernameNotFoundException(username)
    }
}