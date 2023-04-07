package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Area(

    @Comment("임대 면적")
    private val leasable: AreaUnit,

    @Comment("전용 면적")
    private val netLeasable: AreaUnit
) {

}
