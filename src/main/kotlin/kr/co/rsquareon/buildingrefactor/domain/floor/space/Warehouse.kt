package kr.co.rsquareon.buildingrefactor.domain.floor.space

import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Berth
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Framework
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.LoadSpace
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.WarehouseAgencyType
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.WarehouseCategory
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.ConvenienceFacility
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Dock
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Electricity
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.FreightElevator
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Rack
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.DiscriminatorValue
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
@DiscriminatorValue("WAREHOUSE")
class Warehouse(

    @Comment("램프")
    private val ramp: Boolean?,

    @Comment("진입도록 폭")
    private val accessRoadWidth: Double?,

    @Comment("동시 진출입 여부")
    private val entryAndExitAtSameTime: Boolean?,

    @Enumerated(EnumType.STRING)
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

    @Comment("수직 반송기")
    private val verticalConveyorCount: Int?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "exist", column = Column(name = "rack_exist")),
        AttributeOverride(name = "detail", column = Column(name = "rack_detail")),
    )
    private val rack: Rack,

    @Enumerated(EnumType.STRING)
    @Comment("물류창고 유형")
    private val category: WarehouseCategory,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "main", column = Column(name = "main_electricity")),
        AttributeOverride(name = "backup", column = Column(name = "backup_electricity"))
    )
    private val electricity: Electricity,

    // TODO | 임베디드 vs 이넘
    // 임대 or 수탁(입출고관리) 물류 대서비스해
    @Enumerated(EnumType.STRING)
    @Comment("물류 대행사 유형")
    private val agency: WarehouseAgencyType?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "exist", column = Column(name = "convenience_facility_exist")),
//        AttributeOverride(name = "facilityList", column = Column(name = "convenience_facility_list")),
    )
    private val convenienceFacility: ConvenienceFacility?,

    // TODO | 함수로 변경 가능할 듯
    private val sizeUnder500: Boolean?,

    // TODO | 보관가능품목 (avail_item_type_cd_list) | enum list는 맞는가

    @Comment("캐노피")
    private val canopy: Boolean?,

    @Comment("직원 수")
    private val numberOfWorker: Int?,

    @Enumerated(EnumType.STRING)
    private val framework: Framework?,

    @Comment("컨테이너 진입 가능 여부")
    private val containerEntry: Boolean?,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "weight", column = Column(name = "freight_elevator_weight")),
        AttributeOverride(name = "speed", column = Column(name = "freight_elevator_speed")),
        AttributeOverride(name = "count", column = Column(name = "freight_elevator_count"))
    )
    private val freightElevator: FreightElevator?,

// TODO | entry_type_cd_list

    @Comment("전대 가능 여부")
    private val sublease: Boolean?,

    @Comment("상하행 교행")
    private val crossRoad: Boolean?,

    @Comment("스프링쿨러")
    private val springCooler: Boolean?,

    @Comment("방화셔터")
    private val fireproofShutter: Boolean?,

    id: Long = 0L

) : BaseEntity(id) {
}