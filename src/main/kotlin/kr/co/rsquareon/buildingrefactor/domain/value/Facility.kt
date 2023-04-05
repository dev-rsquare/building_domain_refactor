package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
class Facility(

    @Enumerated(EnumType.STRING)
    private val airConditioner: AirConditioner,

    @Enumerated(EnumType.STRING)
    private val heating: AirConditioner,
) {

}
