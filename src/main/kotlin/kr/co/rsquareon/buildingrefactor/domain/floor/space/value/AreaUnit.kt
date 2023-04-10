package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class AreaUnit(

    @Comment("제곱미터")
    private val m2: Double
) {

}
