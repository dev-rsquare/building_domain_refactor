package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class Address(
    private val street: String,

    private val landLot: String
) {
}