package com.aravinth.financemanager.domain.model

enum class TransactionType {
    DEBIT,
    CREDIT
}

enum class TransactionCategory {
    CASH,
    SALES,
    PURCHASE,
    SALES_RETURN,
    PURCHASE_RETURN,
    PETTY_CASH,
    GENERAL
}