package com.javaonthecloud.kotlinrestapi.controller.filter

data class EmployeeFilter(
        var page: Int = 0,
        var size: Int = 10,
        var email: String = "",
        var cpf: String = ""
)