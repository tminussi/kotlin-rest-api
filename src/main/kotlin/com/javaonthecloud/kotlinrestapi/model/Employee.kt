package com.javaonthecloud.kotlinrestapi.model

import com.javaonthecloud.kotlinrestapi.enums.ProfileEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (
        @Id val id: String?,
        val name: String,
        val email: String,
        val password: String,
        val cpf: String,
        val profile: ProfileEnum,
        val companyId: String,
        val pricePerHour: Double,
        val dailyJourneyInHours: Double,
        val lunchJourneyInHours: Double

)