package com.aravinth.financemanager.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface AccountingDao {

     @Insert
     suspend fun addTransactions(accounting: AccountingEntity)

     @Query("SELECT * FROM accounting_table ORDER BY timestamp ASC")
     fun viewTransactions(): Flow<List<AccountingEntity>>

     @Query("SELECT * FROM accounting_table WHERE type = :type")
     fun viewByType(): Flow<List<AccountingEntity>>

     @Delete
     fun deleteTransaction(id: Int)
}