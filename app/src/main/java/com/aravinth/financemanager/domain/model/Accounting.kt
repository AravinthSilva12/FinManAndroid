package com.aravinth.financemanager.domain.model

data class Accounting(
    val id: Int = 0,
    val amount: Double,
    val category: Enum<TransactionCategory>,
    val type: Enum<TransactionType>,
    val timestamp: Long
)