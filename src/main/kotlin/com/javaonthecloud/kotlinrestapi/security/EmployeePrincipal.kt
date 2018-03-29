package com.javaonthecloud.kotlinrestapi.security

import com.javaonthecloud.kotlinrestapi.model.Employee
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class EmployeePrincipal(
        val employee: Employee
) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        val authorities: MutableCollection<GrantedAuthority> = mutableListOf()
        authorities.add(SimpleGrantedAuthority(employee.profile.description))
        return authorities
    }

    override fun isEnabled(): Boolean = true

    override fun getUsername(): String = employee.email

    override fun isCredentialsNonExpired(): Boolean = true

    override fun getPassword(): String = employee.password

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true
}