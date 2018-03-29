package com.javaonthecloud.kotlinrestapi.controller

import com.javaonthecloud.kotlinrestapi.controller.filter.EntryFilter
import com.javaonthecloud.kotlinrestapi.model.Entry
import com.javaonthecloud.kotlinrestapi.service.EntryService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/entries")
class EntryController(
        private val entryService: EntryService
) {

    @PostMapping
    fun create(@RequestBody entry: Entry): Entry = entryService.save(entry)

    @GetMapping
    fun findByEmployeeId(filter: EntryFilter): Page<Entry> = entryService.findByEmployeeId(filter)
}