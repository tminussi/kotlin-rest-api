package com.javaonthecloud.kotlinrestapi.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtils {

    companion object {
        fun hashPassword(password: String) = BCryptPasswordEncoder().encode(password)
    }
}