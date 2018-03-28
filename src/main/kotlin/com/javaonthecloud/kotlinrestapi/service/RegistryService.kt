package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Registry
import com.javaonthecloud.kotlinrestapi.repository.RegistryRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

class RegistryService(
        val registryRepository: RegistryRepository
) {

    fun findByEmployeeId(id: String, pageRequest: PageRequest): Page<Registry> = registryRepository.findByEmployeeId(id, pageRequest)

    fun save(registry: Registry): Registry = registryRepository.save(registry)
}