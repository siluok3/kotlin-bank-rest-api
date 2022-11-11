package springboot.kotlin.kiri.datasource.mock

import org.springframework.stereotype.Repository
import springboot.kotlin.kiri.datasource.BankDataSource
import springboot.kotlin.kiri.model.Bank

@Repository
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf(
        Bank("Kiri", 0.5, 3),
        Bank("Kiriakos", 0.8, 13),
        Bank("Papachristou", 0.2, 35),
    )

    override fun fetchBanks(): Collection<Bank> = banks
    override fun fetchBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Account number $accountNumber does not exist!")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Account ${bank.accountNumber} already exists!")
        }
        banks.add(bank)

        return bank
    }

    override fun updateBank(updatedBank: Bank): Bank {
        val existingBank: Bank = banks.find { it.accountNumber == updatedBank.accountNumber }
            ?: throw NoSuchElementException("Account ${updatedBank.accountNumber} does not exist!")

        banks.remove(existingBank)
        banks.add(updatedBank)

        return updatedBank
    }
}