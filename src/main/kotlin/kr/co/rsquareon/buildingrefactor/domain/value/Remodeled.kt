package kr.co.rsquareon.buildingrefactor.domain.value

import org.hibernate.annotations.Comment
import java.time.Year
import javax.persistence.Embeddable

@Embeddable
class Remodeled(
    @Comment("리모델링 연도")
    private val remodeledYear: Year,

    @Comment("리모델링 여부")
    private val remodeled: Boolean
) {

}
