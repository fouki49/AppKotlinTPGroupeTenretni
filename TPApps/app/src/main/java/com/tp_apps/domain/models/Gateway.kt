package com.tp_apps.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Gateway(
    val href: String,
    val serialNumber: String,
    val revision: String,
    val pin: String,
    val hash: String,
    val customer: Customer,
    val connection: Connection,
    val config: Config
)