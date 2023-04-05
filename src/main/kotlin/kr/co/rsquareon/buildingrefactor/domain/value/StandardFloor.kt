package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Area
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class StandardFloor(
    // TODO nullable 여부 확인
    private val standardFloor: Int,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "leasable.value", column = Column(name = "standard_floor_leasable_area")),
        AttributeOverride(name = "netLeasable.value", column = Column(name = "standard_floor_net_leasable_area"))
    )
    private val area: Area,

    // TODO 비용으로 묶어도 될까
    @AttributeOverride(name = "value", column = Column(name = "deposit"))
    private val deposit: Money,

    // TODO 비용으로 묶어도 될까
    @AttributeOverride(name = "value", column = Column(name = "rent"))
    private val rent: Money,

    // TODO 비용으로 묶어도 될까
    @AttributeOverride(name = "value", column = Column(name = "maintenance"))
    private val maintenance: Money,

    @AttributeOverrides(
        AttributeOverride(name = "numberOfMonth.value", column = Column(name = "fit_out_number_of_month")),
        AttributeOverride(name = "maintenanceIncluded", column = Column(name = "fit_out_maintenance_included")),
    )
    private val fitOut: Benefit,

    @AttributeOverrides(
        AttributeOverride(name = "numberOfMonth.value", column = Column(name = "rent_free_number_of_month")),
        AttributeOverride(name = "maintenanceIncluded", column = Column(name = "rent_free_maintenance_included")),
    )
    private val rentFree: Benefit,

//    // TODO 소수 필요 여부 확인
//    private val tenantImprovement: Money,
//
//    // TODO 소수 필요 여부 확인
//    private val noc: Money
) {

}
