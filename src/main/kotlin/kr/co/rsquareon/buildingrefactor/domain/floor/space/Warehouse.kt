package kr.co.rsquareon.buildingrefactor.domain.floor.space

import kr.co.rsquareon.buildingrefactor.domain.floor.space.enums.Berth
import kr.co.rsquareon.buildingrefactor.domain.floor.space.enums.Framework
import kr.co.rsquareon.buildingrefactor.domain.floor.space.enums.LoadSpace
import kr.co.rsquareon.buildingrefactor.domain.floor.space.enums.WarehouseAgency
import kr.co.rsquareon.buildingrefactor.domain.floor.space.enums.WarehouseCategory
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.ConvenienceFacility
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Dock
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Electricity
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Rack
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.DiscriminatorValue
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
@DiscriminatorValue("WAREHOUSE")
class Warehouse(

    private val ramp: Boolean?,

    @Comment("진입도록 폭")
    private val accessRoadWidth: Double?,

    @Comment("동시 진출입 여부")
    private val entryAndExitAtSameTime: Boolean?,

    @Comment("하역공간")
    private val loadSpace: LoadSpace?,

    @Comment("차량접안")
    private val berth: Berth?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "count", column = Column(name = "dock_count")),
        AttributeOverride(name = "levelerCount", column = Column(name = "dock_leveler_count")),
    )
    private val dock: Dock?,

    private val verticalConveyorCount: Int?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "exist", column = Column(name = "rack_exist")),
        AttributeOverride(name = "detail", column = Column(name = "rack_detail")),
    )
    private val rack: Rack,

    @Enumerated(EnumType.STRING)
    private val category: WarehouseCategory,

    // TODO | 기타시설비 | RTB etc_fac

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "main", column = Column(name = "main_electricity")),
        AttributeOverride(name = "backup", column = Column(name = "backup_electricity"))
    )
    private val electricity: Electricity,

    // TODO | 물류대행지원 상태 (임대창고, 수탁창고 등) 모르겠음
    @Enumerated(EnumType.STRING)
    private val agency: WarehouseAgency?,

    // TODO | exist
    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "exist", column = Column(name = "convenience_facility_exist")),
        AttributeOverride(name = "facilityList", column = Column(name = "convenience_facility_list")),
    )
    private val convenienceFacility: ConvenienceFacility?,

    private val sizeUnder500: Boolean?,

    // TODO | 보관가능품목 (avail_item_type_cd_list) | enum list는 맞는가

    private val numberOfWorker: Int?,

    private val canopy: Boolean?,

    private val containerEntry: Boolean?,

    @Enumerated(EnumType.STRING)
    private val framework: Framework?,


    id: Long = 0L

) : BaseEntity(id) {
}