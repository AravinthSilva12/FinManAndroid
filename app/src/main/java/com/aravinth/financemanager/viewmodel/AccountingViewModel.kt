package com.aravinth.financemanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aravinth.financemanager.data.local.AccountingEntity
import com.aravinth.financemanager.domain.usecase.AddTransactionUseCase
import com.aravinth.financemanager.domain.usecase.GetTransactionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccountingViewModel @Inject constructor(
    private val addTransactionUseCase: AddTransactionUseCase,
    private val getTransactionsUseCase: GetTransactionsUseCase
) : ViewModel() {

    val transactions = getTransactionsUseCase.execute()

    fun addTransaction(item: AccountingEntity) {
        viewModelScope.launch {
            addTransactionUseCase.execute(item)
        }
    }
}