package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class Expense(
    private val deposit: Money,

    private val rent: Money,

    private val maintenance: Money,
) {

}