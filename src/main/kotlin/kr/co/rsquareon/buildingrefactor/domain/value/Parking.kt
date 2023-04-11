package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.AreaUnit
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
class Parking(

    @Enumerated(EnumType.STRING)
//    //MSH @Comment("지정주차 여부")
    private val designationType: DesignationParkingType?,

    @Enumerated(EnumType.STRING)
    //MSH @Comment("주차장 유형")
    private val parkingLotType: ParkingLotType?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "count", column = Column(name = "free_parking_count"/*, columnDefinition = "INTEGER COMMENT '무료 주차 대수'"*/)),
        AttributeOverride(name = "detail", column = Column(name = "free_parking_detail"/*, columnDefinition = "VARCHAR(255) COMMENT '무료 주차 추가 설명'"*/)),
        AttributeOverride(name = "parkingAvailable", column = Column(name = "free_parking_parking_available"/*, columnDefinition = "VARCHAR(255) COMMENT '무료 주차 가능 여부'"*/)),
    )
    private val free: ParkingDetail,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "count", column = Column(name = "paid_parking_count"/*, columnDefinition = "INTEGER COMMENT '유료 주차 대수'"*/)),
        AttributeOverride(name = "detail", column = Column(name = "paid_parking_detail"/*, columnDefinition = "VARCHAR(255) COMMENT '유료 주차 대수'"*/)),
        AttributeOverride(name = "parkingAvailable", column = Column(name = "paid_parking_parking_available"/*, columnDefinition = "VARCHAR(255) COMMENT '유료 주차 대수'"*/)),
    )
    private val paid: ParkingDetail,

    @Comment("주차장 면적")
    private val area: AreaUnit?,

    // TODO 아래 내용 확인 필요
    /**
     * 주차대수 건축물 대장에서 조회 가능(예상)
     * 유료 주차: 공사중/전부 무료 주차등의 케이스
     * 무료 주차: 꼭 주차장을 의미하는건 아님(지원금 형태도 가능)
     * 평당 한 대, 세대당 한 대, 선착순 주차
     * 합계 계산에 대한 고려(표제부/전유부)
     */
) {
}