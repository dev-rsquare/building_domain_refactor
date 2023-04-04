package kr.co.rsquareon.buildingrefactor.domain.value.floor.space

import kr.co.rsquareon.buildingrefactor.domain.value.floor.Floor
import kr.co.rsquareon.buildingrefactor.domain.value.floor.space.value.Area
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.DiscriminatorColumn
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
@DiscriminatorColumn(name = "USAGE")
class Space(

    private val name: String,

    private val alias: String?,

    @ManyToOne
    private val floor: Floor,

    @Embedded
    private val area: Area,

    id: Long = 0L
) : BaseEntity(id) {
}