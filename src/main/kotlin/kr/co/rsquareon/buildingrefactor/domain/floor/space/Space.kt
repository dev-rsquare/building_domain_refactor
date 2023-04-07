package kr.co.rsquareon.buildingrefactor.domain.floor.space

import kr.co.rsquareon.buildingrefactor.domain.floor.Floor
import kr.co.rsquareon.buildingrefactor.domain.floor.space.value.Area
import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.DiscriminatorColumn
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
@DiscriminatorColumn(name = "USAGE")
class Space(
    @Comment("공간 명")
    private val name: String,

    @Comment("공간 별칭")
    private val alias: String?,

    @ManyToOne
    @JoinColumn(name = "floor_id")
    private val floor: Floor,

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "leasable.m2", column = Column(name = "space_leasable_area")),
        AttributeOverride(name = "netLeasable.m2", column = Column(name = "space_net_leasable_area")),
    )
    private val area: Area,

    id: Long = 0L
) : BaseEntity(id) {
}