package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Ramp(
    @Comment("램프 여부")
    private val exist: Boolean?,

    @Comment("램프 면적")
    private val area: Double?
) {

}