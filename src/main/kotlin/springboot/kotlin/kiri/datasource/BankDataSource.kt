package springboot.kotlin.kiri.datasource

import springboot.kotlin.kiri.model.Bank

interface BankDataSource {

    fun fetchBanks(): Collection<Bank>

    fun fetchBank(accountNumber: String): Bank

    fun createBank(bank: Bank): Bank

    fun updateBank(bank: Bank): Bank
}