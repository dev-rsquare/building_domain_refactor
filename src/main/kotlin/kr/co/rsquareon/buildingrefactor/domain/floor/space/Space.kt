package kr.co.rsquareon.buildingrefactor.domain.floor.space

import kr.co.rsquareon.buildingrefactor.domain.floor.Floor
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Area
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.DiscriminatorColumn
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
@DiscriminatorColumn(name = "USAGE")
class Space(

    private val name: String,

    private val alias: String?,

    @ManyToOne
    @JoinColumn(name = "floor_id")
    private val floor: Floor,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "leasable.value", column = Column(name = "space_leasable_area")),
        AttributeOverride(name = "netLeasable.value", column = Column(name = "space_net_leasable_area")),
    )
    private val area: Area,

    id: Long = 0L
) : BaseEntity(id) {
}