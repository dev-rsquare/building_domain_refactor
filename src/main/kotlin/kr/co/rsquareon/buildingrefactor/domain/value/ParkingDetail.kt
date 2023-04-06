package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.enums.ParkingAvailable
import javax.persistence.Embeddable
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
class ParkingDetail(
    private val count: Int?,

    private val detail: String?,

    @Enumerated(EnumType.STRING)
    private val parkingAvailable: ParkingAvailable
) {
}