package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Area
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class StandardFloor(
    // 기준층이 여러개일 수 있는 가능성 고려(현업 사용성에 따라 다름)
    private val standardFloor: Int?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "leasable.value", column = Column(name = "standard_floor_leasable_area")),
        AttributeOverride(name = "netLeasable.value", column = Column(name = "standard_floor_net_leasable_area"))
    )
    private val area: Area,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "deposit.value", column = Column(name = "deposit")),
        AttributeOverride(name = "rent.value", column = Column(name = "rent")),
        AttributeOverride(name = "maintenance.value", column = Column(name = "maintenance"))
    )
    private val expense: Expense,

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

    // 지원금액 / 전용면적
    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "tenant_improvement"))
    private val tenantImprovement: MoneyPerSpace,

    // (보증금*보증금 운용이율 /12개월 + 임대료 + 관리비)/(연면적*전용률)
    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "noc"))
    private val noc: MoneyPerSpace
) {

}
