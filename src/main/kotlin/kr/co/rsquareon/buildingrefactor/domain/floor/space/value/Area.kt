package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import javax.persistence.Embeddable

@Embeddable
class Area(
    // 임대 면적
    private val leasable: AreaUnit,

    // 전용 면적
    private val netLeasable: AreaUnit
) {

}
