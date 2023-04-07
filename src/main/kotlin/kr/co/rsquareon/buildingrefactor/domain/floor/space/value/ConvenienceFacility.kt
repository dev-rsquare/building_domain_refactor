package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class ConvenienceFacility(

    @Comment("편의시설 존재 여부")
    private val exist: Boolean?,

    // TODO | ENUM 리스트로 받는게 맞는가
//    @Comment("편의시설 종류 목록")
//    private val facilityList: MutableList<Facility> = mutableListOf()
) {
}