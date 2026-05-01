package com.aravinth.financemanager.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aravinth.financemanager.ui.screen.accounting.AccountingScreen
import com.aravinth.financemanager.ui.screen.accounting.AddTransaction
import com.aravinth.financemanager.ui.screen.accounting.ViewTransactions
import com.aravinth.financemanager.ui.screen.assets.AssetsScreen
import com.aravinth.financemanager.ui.screen.budgeting.BudgetingScreen
import com.aravinth.financemanager.ui.screen.home.HomeScreen


@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
        Box(modifier = Modifier.navigationBarsPadding())
         { BottomNavigationBar(navController) }
        }
    ) { innerPadding ->
        NavHost(navController = navController,
            startDestination = Screen.Home,
            modifier = Modifier.fillMaxSize().padding(innerPadding))
        {
            composable<Screen.Home> { HomeScreen(navController) }
            composable<Screen.Assets> { AssetsScreen(navController) }
            composable<Screen.Accounting> { AccountingScreen(navController) }
            composable<Screen.Budgeting> { BudgetingScreen(navController) }
            composable<Screen.AddTransaction> { AddTransaction(navController) }
            composable<Screen.ViewTransactions> { ViewTransactions(navController) }
        }
    }
}
