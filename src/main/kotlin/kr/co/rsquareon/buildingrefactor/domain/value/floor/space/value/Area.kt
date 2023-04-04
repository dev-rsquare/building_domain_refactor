package kr.co.rsquareon.buildingrefactor.domain.value.floor.space.value

import kr.co.rsquareon.buildingrefactor.domain.value.floor.space.value.AreaWithUnit
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Area(
    @AttributeOverride(name = "value", column = Column(name = "leasable_area"))
    private val leasableArea: AreaWithUnit,
    @AttributeOverride(name = "value", column = Column(name = "net_leasable_area"))
    private val netLeasableArea: AreaWithUnit
) {

}
