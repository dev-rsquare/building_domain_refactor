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
import kr.co.rsquareon.buildingrefactor.domain.value.StandardFloors
import kr.co.rsquareon.buildingrefactor.util.RootAggregate
import org.hibernate.annotations.Comment
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.CollectionTable
import javax.persistence.ElementCollection
import javax.persistence.JoinColumn

@Entity
class Building(

    @Column(nullable = false)
    @Comment("건물 이름")
    private val name: String,

    @Comment("동/관 정보 - e.g. A동")
    private val wing: String?,

    @Embedded
    private val standardFloors: StandardFloors,
//    private val standardFloor: StandardFloor,
//    @ElementCollection
//    @CollectionTable(
//        name = "standard_floors",
//        joinColumns = [JoinColumn(name = "building_id")]
//    )
//    private val standardFloors: MutableList<StandardFloor> = mutableListOf(),

    @Embedded
    private val location: Location,

    @Embedded
    private val address: Address,

    @Enumerated(EnumType.STRING)
    @Comment("건설상태")
    private val constructionStatus: ConstructionStatus?,

    @Embedded
    private val completionDate: CompletionDate?,

    @Embedded
    private val remodeled: Remodeled?,

    @Embedded
    private val parking: Parking?,

    @Enumerated(EnumType.STRING)
    @Comment("휴일 개방")
    private val openOnHoliday: Openable?,

    @Enumerated(EnumType.STRING)
    @Comment("24시 개방")
    private val openOnAllDay: Openable?,

    @Embedded
    private val toilet: Toilet,

    @Embedded
    private val elevator: Elevator,

    @Embedded
    private val restArea: RestArea?,

    @Embedded
    private val area: BuildingArea,

    @Embedded
    private val facility: Facility?,

    private val urbanDevelopmentDistrict: Boolean,

    private val mainPurpose: String?,

    private val buildingDirection: Bearing,

    id: Long = 0L
) : RootAggregate<Building>(id) {


    @Embedded
    private val floors: Floors = Floors()

    private val code: String = "1a"


}

