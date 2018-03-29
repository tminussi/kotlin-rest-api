package com.javaonthecloud.kotlinrestapi.service

import com.javaonthecloud.kotlinrestapi.controller.filter.EntryFilter
import com.javaonthecloud.kotlinrestapi.model.Entry
import com.javaonthecloud.kotlinrestapi.repository.EntryRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class EntryService(
        val entryRepository: EntryRepository
) {

    fun findByEmployeeId(filter: EntryFilter): Page<Entry> = entryRepository.findByEmployeeId(filter.employeeId, PageRequest(filter.page, filter.size))

    fun save(entry: Entry): Entry = entryRepository.save(entry)
}