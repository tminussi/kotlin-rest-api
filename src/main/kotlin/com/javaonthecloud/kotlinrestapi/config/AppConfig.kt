package com.javaonthecloud.kotlinrestapi.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Autowired(required = true)
    fun configeJackson(jackson: ObjectMapper) {
        jackson.registerModule(KotlinModule())
    }

}
