package springboot.kotlin.kiri.service

import org.springframework.stereotype.Service
import springboot.kotlin.kiri.datasource.BankDataSource
import springboot.kotlin.kiri.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.fetchBanks()

    fun getBank(accountNumber: String): Bank = dataSource.fetchBank(accountNumber)

    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)

    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)

    fun deleteBank(accountNumber: String) = dataSource.deleteBank(accountNumber)
}