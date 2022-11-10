package springboot.kotlin.kiri.datasource

import springboot.kotlin.kiri.model.Bank

interface BankDataSource {

    fun fetchBanks(): Collection<Bank>
}