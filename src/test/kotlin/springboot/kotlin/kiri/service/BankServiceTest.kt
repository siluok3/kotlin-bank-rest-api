package springboot.kotlin.kiri.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import springboot.kotlin.kiri.datasource.BankDataSource

internal class BankServiceTest
{
    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        //when
        bankService.getBanks()

        //then
        verify(exactly = 1) { dataSource.fetchBanks() }
    }
}