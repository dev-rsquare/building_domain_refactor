package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
class Parking(

    @Enumerated(EnumType.STRING)
    private val designationType: DesignationParkingType?,

    @Enumerated(EnumType.STRING)
    private val parkingLotType: ParkingLotType?,

    // TODO 아래 내용 확인 필요
    /**
     * 무료 주차 상세
     * 무료 주차 개수
     * 유료 주차 기준 코드[01:불가능, 02:협의, 03:가능, 04:확인불가]
     * 유료 주차 개수
     * 유료 주차 상세
     */
) {
}