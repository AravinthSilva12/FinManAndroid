package com.aravinth.financemanager.ui.screen.accounting

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.aravinth.financemanager.viewmodel.AccountingViewModel


@Composable
fun AddTransaction(navController: NavController, viewModel: AccountingViewModel = hiltViewModel()) {

    //State:
    val transactions by viewModel.transactions.collectAsState(emptyList())


}