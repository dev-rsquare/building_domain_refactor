package kr.co.rsquareon.buildingrefactor.domain.value

import java.time.Year
import javax.persistence.Embeddable

@Embeddable
class Remodeled(
    private val year: Year,

    private val remodeled: Boolean
) {

}
