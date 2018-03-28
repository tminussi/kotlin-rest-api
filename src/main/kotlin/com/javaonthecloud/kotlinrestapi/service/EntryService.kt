package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.model.Entry
import com.javaonthecloud.kotlinrestapi.repository.EntryRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class EntryService(
        val entryRepository: EntryRepository
) {

    fun findByEmployeeId(id: String, pageRequest: PageRequest): Page<Entry> = entryRepository.findByEmployeeId(id, pageRequest)

    fun save(entry: Entry): Entry = entryRepository.save(entry)
}