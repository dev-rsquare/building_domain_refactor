package kr.co.rsquareon.buildingrefactor.domain.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
class ParkingDetail(
//    //MSH @Comment("주차 대수")
    private val count: Int?,

//    //MSH @Comment("주차 상세")
    private val detail: String?,

    @Enumerated(EnumType.STRING)
//    //MSH @Comment("주차 가능 상태")
    private val parkingAvailable: ParkingAvailable
) {
}