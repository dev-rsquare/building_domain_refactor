package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.AreaUnit
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class BuildingArea(

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "land_area"))
    @Comment("대지면적(수평투영면적)")
    private val land: AreaUnit?,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "building_area"))
    @Comment("건축면적(가장 넓은 층의 바닥면적, 지하는 제외)")
    private val building: AreaUnit?,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "total_ground_area"))
    @Comment("연면적(모든 층면적의 합)")
    private val totalGround: AreaUnit?,

    @Embedded
    @AttributeOverride(name = "percentage", column = Column(name = "efficiency_rate"))
    @Comment("용적률(연면적 / 대지면적)")
    private val efficiencyRate: Percentage,

) {
}