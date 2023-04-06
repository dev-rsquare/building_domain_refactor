package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import javax.persistence.Embeddable

@Embeddable
class Electricity(
    private val main: Double?,

    private val backup: Double?
) {
}