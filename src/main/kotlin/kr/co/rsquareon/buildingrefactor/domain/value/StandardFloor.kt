package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.Building
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Area
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import kr.co.rsquareon.buildingrefactor.util.CommentOverride
import kr.co.rsquareon.buildingrefactor.util.CommentOverrides
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class StandardFloor(

    private val standardFloor: Int?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "leasable.m2", column = Column(name = "standard_floor_leasable_area")),
        AttributeOverride(name = "netLeasable.m2", column = Column(name = "standard_floor_net_leasable_area"))
    )
    @CommentOverrides(
        CommentOverride(target = "leasable.m2", value = "기준층 임대 면적(제곱미터)"),
        CommentOverride(target = "netLeasable.m2", value = "기준층 전용 면적(제곱미터)"),
    )
    private val area: Area,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "deposit.value", column = Column(name = "deposit")),
        AttributeOverride(name = "rent.value", column = Column(name = "rent")),
        AttributeOverride(name = "maintenance.value", column = Column(name = "maintenance"))
    )
    private val expense: Expense,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "numberOfMonth.value", column = Column(name = "fit_out_number_of_month")),
        AttributeOverride(name = "maintenanceIncluded", column = Column(name = "fit_out_maintenance_included")),
    )
//    @Comment("핏아웃(공사중에는 임대료면제)")
    private val fitOut: Benefit,

    @Embedded
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

    @ManyToOne
    @JoinColumn(name = "building_id")
    private val building: Building,

    id: Long = 0L
) : BaseEntity(id) {

//    @Embedded
//    private val sample: Sample = Sample("asdf")

}
