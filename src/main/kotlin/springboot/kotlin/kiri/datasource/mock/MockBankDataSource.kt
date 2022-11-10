package springboot.kotlin.kiri.datasource.mock

import org.springframework.stereotype.Repository
import springboot.kotlin.kiri.datasource.BankDataSource
import springboot.kotlin.kiri.model.Bank

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("Kiri", 0.5, 3),
        Bank("Kiriakos", 0.8, 13),
        Bank("Papachristou", 0.2, 35),
    )

    override fun fetchBanks(): Collection<Bank> = banks
}