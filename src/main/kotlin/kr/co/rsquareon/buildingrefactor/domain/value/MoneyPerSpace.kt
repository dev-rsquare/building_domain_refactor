package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class MoneyPerSpace(
    private val value: Double
) {

}