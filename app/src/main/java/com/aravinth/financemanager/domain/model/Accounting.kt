package com.aravinth.financemanager.domain.model

import androidx.room.PrimaryKey

data class Accounting(
    val id: Int = 0,
    val amount: Double,
    val category: Enum<TransactionCategory>,
    val type: Enum<TransactionType>,
    val timestamp: Long
)