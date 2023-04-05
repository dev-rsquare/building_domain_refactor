package kr.co.rsquareon.buildingrefactor.domain.value

import java.time.Year
import javax.persistence.Embeddable

@Embeddable
class Remodeled(
    private val remodeledYear: Year,

    private val remodeled: Boolean
) {

}
