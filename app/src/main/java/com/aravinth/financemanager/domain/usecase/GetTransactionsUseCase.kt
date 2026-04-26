package com.aravinth.financemanager.domain.usecase

import com.aravinth.financemanager.data.local.AccountingEntity
import com.aravinth.financemanager.data.repository.RoomAccountingRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTransactionsUseCase @Inject constructor(
    private val repository: RoomAccountingRepository
) {
    fun execute(): Flow<List<AccountingEntity>> {
        return repository.viewTransactions()
    }
}