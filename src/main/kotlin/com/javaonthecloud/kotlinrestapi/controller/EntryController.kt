package com.javaonthecloud.kotlinrestapi.controller

import com.javaonthecloud.kotlinrestapi.model.Entry
import com.javaonthecloud.kotlinrestapi.service.EntryService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/entries")
class EntryController(
        private val entryService: EntryService
) {

    @PostMapping
    fun create(@RequestBody entry: Entry): Entry = entryService.save(entry)

    @GetMapping
    fun findByEmployeeId(@RequestParam(required = true, defaultValue = "") id: String,
                         @RequestParam(required = false, defaultValue = "1") size: Int,
                         @RequestParam(required = false, defaultValue = "0") page: Int): Page<Entry> = entryService.findByEmployeeId(id, PageRequest(page, size))
}