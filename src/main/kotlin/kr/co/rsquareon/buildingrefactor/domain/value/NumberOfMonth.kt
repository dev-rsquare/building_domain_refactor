package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class NumberOfMonth(
    private val value: Int
) {
}