package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import javax.persistence.Embeddable

@Embeddable
class FreightElevator(
    private val weight: Double?,

    private val speed: Double?,

    private val count: Int?
) {
}