package com.javaonthecloud.kotlinrestapi.controller.filter

data class EntryFilter(
        var page: Int = 0,
        var size: Int = 10,
        var employeeId: String = ""
)