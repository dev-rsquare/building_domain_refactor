package kr.co.rsquareon.buildingrefactor.domain

import kr.co.rsquareon.buildingrefactor.domain.value.Address
import kr.co.rsquareon.buildingrefactor.domain.value.Location
import kr.co.rsquareon.buildingrefactor.util.RootAggregate
import javax.persistence.Embedded
import javax.persistence.Entity

@Entity
class Building(

    private val name: String,

    private val wing: String?,

    @Embedded
    private val location: Location,

    @Embedded
    private val address: Address,

    id: Long = 0L
) : RootAggregate<Building>(id) {

    private val code: String = "1a"


}

