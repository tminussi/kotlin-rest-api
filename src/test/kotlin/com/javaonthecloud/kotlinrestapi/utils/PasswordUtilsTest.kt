package com.javaonthecloud.kotlinrestapi.utils

import com.javaonthecloud.kotlinrestapi.utils.PasswordUtils.Companion.hashPassword
import org.junit.Test

import org.junit.Assert.*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtilsTest {

    private val password = "password"
    private val encoder = BCryptPasswordEncoder()

    @Test
    fun hashPasswordTest() {
        val hash = hashPassword(password)
        assertTrue(encoder.matches(password, hash))
    }
}