package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Area
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity

@Entity
class StandardFloor(
    // 기준층이 여러개일 수 있는 가능성 고려(현업 사용성에 따라 다름)
    private val standardFloor: Int?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "leasable.m2", column = Column(name = "standard_floor_leasable_area")),
        AttributeOverride(name = "netLeasable.m2", column = Column(name = "standard_floor_net_leasable_area"))
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
    @Comment("핏아웃(공사중에는 임대료면제)")
    private val fitOut: Benefit,

    @AttributeOverrides(
        AttributeOverride(name = "numberOfMonth.value", column = Column(name = "rent_free_number_of_month")),
        AttributeOverride(name = "maintenanceIncluded", column = Column(name = "rent_free_maintenance_included")),
    )
    private val rentFree: Benefit,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "tenant_improvement"))
    @Comment("TI(지원금액/전용면적)")
    private val tenantImprovement: MoneyPerSpace,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "noc"))
    @Comment("순점유비용(보증금*보증금 운용이율 /12개월 + 임대료 + 관리비)/(연면적*전용률)")
    private val noc: MoneyPerSpace,

    id: Long = 0L
) : BaseEntity(id) {

    @Embedded
    private val sample: Sample = Sample("asdf")

}
