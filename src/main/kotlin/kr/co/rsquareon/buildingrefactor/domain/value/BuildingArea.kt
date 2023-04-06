package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.AreaUnit
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class BuildingArea(

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "land_area"))
    private val land: AreaUnit?,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "building_area"))
    private val building: AreaUnit?,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "total_ground_area"))
    private val totalGroundArea: AreaUnit?,

    @Embedded
    private val floorAreaRatio: Percentage,

) {
}