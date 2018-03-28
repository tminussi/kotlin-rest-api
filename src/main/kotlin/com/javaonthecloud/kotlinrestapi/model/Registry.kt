package com.javaonthecloud.kotlinrestapi.model

import com.javaonthecloud.kotlinrestapi.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Registry (
        @Id val id: String,
        val date: Date,
        val type: TypeEnum,
        val employeeId: String
)