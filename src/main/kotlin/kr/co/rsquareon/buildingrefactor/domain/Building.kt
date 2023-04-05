package kr.co.rsquareon.buildingrefactor.domain

import kr.co.rsquareon.buildingrefactor.domain.value.Address
import kr.co.rsquareon.buildingrefactor.domain.value.CompletionDate
import kr.co.rsquareon.buildingrefactor.domain.value.Elevator
import kr.co.rsquareon.buildingrefactor.domain.value.Floors
import kr.co.rsquareon.buildingrefactor.domain.value.Location
import kr.co.rsquareon.buildingrefactor.domain.value.Openable
import kr.co.rsquareon.buildingrefactor.domain.value.Parking
import kr.co.rsquareon.buildingrefactor.domain.value.Remodeled
import kr.co.rsquareon.buildingrefactor.domain.value.StandardFloor
import kr.co.rsquareon.buildingrefactor.domain.value.Toilet
import kr.co.rsquareon.buildingrefactor.domain.value.Bearing
import kr.co.rsquareon.buildingrefactor.domain.value.BuildingArea
import kr.co.rsquareon.buildingrefactor.domain.value.ConstructionStatus
import kr.co.rsquareon.buildingrefactor.domain.value.Facility
import kr.co.rsquareon.buildingrefactor.domain.value.RestArea
import kr.co.rsquareon.buildingrefactor.util.IDK
import kr.co.rsquareon.buildingrefactor.util.RootAggregate
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class Building(

    private val name: String,

    private val wing: String?,

    // TODO 내용 확인
    // paro_bld_chk_need_yn 분양 빌딩 조사 필요 여부(TM 조사 필요 여부)
    private val parcelOut: IDK,

    @Embedded
    private val standardFloor: StandardFloor,

    @Embedded
    private val location: Location,

    @Embedded
    private val address: Address,

    @Enumerated(EnumType.STRING)
    private val constructionStatus: ConstructionStatus,

    @Embedded
    private val completionDate: CompletionDate,

    @Embedded
    private val remodeled: Remodeled,

    @Embedded
    private val parking: Parking,

    @Enumerated(EnumType.STRING)
    private val openOnHoliday: Openable,

    @Enumerated(EnumType.STRING)
    private val openOnAllDay: Openable,

    @Embedded
    private val toilet: Toilet,

    @Embedded
    private val elevator: Elevator,

    @Embedded
    private val restArea: RestArea,

    @Embedded
    private val area: BuildingArea,

    @Embedded
    private val facility: Facility,

    private val urbanDevelopmentDistrict: Boolean,

    private val buildingKind: String,

    private val buildingDirection: Bearing,

    id: Long = 0L
) : RootAggregate<Building>(id) {


    @Embedded
    private val floors: Floors = Floors()

    private val code: String = "1a"


}

