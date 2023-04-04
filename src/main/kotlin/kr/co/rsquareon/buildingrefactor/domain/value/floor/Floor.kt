package kr.co.rsquareon.buildingrefactor.domain.value.floor

import kr.co.rsquareon.buildingrefactor.domain.Building
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class Floor(

    private val name: String,

    private val alias: String?,

    @ManyToOne
    private val building: Building,

    id: Long = 0L
) : BaseEntity(id) {


}