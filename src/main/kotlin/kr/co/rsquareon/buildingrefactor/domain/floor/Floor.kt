package kr.co.rsquareon.buildingrefactor.domain.floor

import kr.co.rsquareon.buildingrefactor.domain.Building
import kr.co.rsquareon.buildingrefactor.domain.floor.value.Spaces
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Floor(

    private val value: Int,

    private val alias: String?,

    @ManyToOne
    @JoinColumn(name = "building_id")
    val building: Building,

    @Embedded
    val spaces: Spaces,

    id: Long = 0L
) : BaseEntity(id) {

    fun isGround(): Boolean {
        return this.value > 0
    }

    fun isUnderGround(): Boolean {
        return this.value < 0
    }

}