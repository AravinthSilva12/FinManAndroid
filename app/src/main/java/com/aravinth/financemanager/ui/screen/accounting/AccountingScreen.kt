package com.aravinth.financemanager.ui.screen.accounting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.aravinth.financemanager.ui.navigation.Screen
import com.aravinth.financemanager.viewmodel.AccountingViewModel

@Composable
fun AccountingScreen (navController: NavController) {

    val viewModel: AccountingViewModel = hiltViewModel()
    Scaffold(modifier = Modifier.fillMaxSize().padding(4.dp),
        floatingActionButton = {
            Row(horizontalArrangement = Arrangement.spacedBy(48.dp)) {
                ExtendedFloatingActionButton(
                    onClick = { navController.navigate(Screen.AddTransaction) },
                    icon = { Icon(Icons.Default.Add, contentDescription = "Add transaction") },
                    text = { Text("Add Transaction") }
                )

                ExtendedFloatingActionButton(
                    onClick = {navController.navigate()}
                )
            }
        }
     )
    {innerPadding ->
        // Use innerPadding if needed, e.g. Box(modifier = Modifier.padding(innerPadding))
    }
}
