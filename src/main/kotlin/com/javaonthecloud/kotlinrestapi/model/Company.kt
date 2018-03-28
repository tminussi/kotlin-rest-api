package com.javaonthecloud.kotlinrestapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Company (
        @Id val id: String? = null,
        val razaoSocial: String,
        val cnpj: String

)