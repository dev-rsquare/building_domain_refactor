package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.enums.Facility
import javax.persistence.Embeddable

@Embeddable
class ConvenienceFacility(
    private val exist: Boolean?,

    // TODO | ENUM 리스트로 받는게 맞는가
    private val facilityList: MutableList<Facility> = mutableListOf()
) {
}