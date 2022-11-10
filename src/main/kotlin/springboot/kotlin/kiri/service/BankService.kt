package springboot.kotlin.kiri.service

import org.springframework.stereotype.Service
import springboot.kotlin.kiri.datasource.BankDataSource
import springboot.kotlin.kiri.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.fetchBanks()
    fun getBank(accountNumber: String): Bank = dataSource.fetchBank(accountNumber)
}