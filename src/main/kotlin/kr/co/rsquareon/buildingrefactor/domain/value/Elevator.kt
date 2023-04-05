package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class Elevator(
    private val forFreight: Int?,

    private val forPeople: Int?
) {

}
