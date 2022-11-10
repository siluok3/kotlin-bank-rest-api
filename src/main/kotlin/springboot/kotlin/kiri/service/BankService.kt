package springboot.kotlin.kiri.service

import org.springframework.stereotype.Service
import springboot.kotlin.kiri.datasource.BankDataSource
import springboot.kotlin.kiri.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.fetchBanks()
}