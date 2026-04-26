package com.aravinth.financemanager.domain.usecase

import com.aravinth.financemanager.data.local.AccountingEntity
import com.aravinth.financemanager.data.repository.RoomAccountingRepository
import javax.inject.Inject

class AddTransactionUseCase @Inject constructor(
    private val repository: RoomAccountingRepository
) {
    suspend fun execute(item: AccountingEntity) {
        repository.addTransaction(item)
    }
}