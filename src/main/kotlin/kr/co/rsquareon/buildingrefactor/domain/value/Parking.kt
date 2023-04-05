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
     * 무료 주차 기준 코드
     * 무료 주차 상세
     * 무료 주차 개수
     * 유료 주차 기준 코드[01:불가능, 02:협의, 03:가능, 04:확인불가]
     * 유료 주차 개수
     * 유료 주차 상세
     */

    /**
     * 건축물 대장에서 조회 가능(예상)
     * 유료 주차: 공사중/전부 무료 주차등의 케이스
     * 무료 주차: 꼭 주차장을 의미하는건 아님(지원금 형태도 가능)
     * 평당 한 대, 세대당 한 대, 선착순 주차
     * 합계 계산에 대한 고려(표제부/전유부)
     */
) {
}