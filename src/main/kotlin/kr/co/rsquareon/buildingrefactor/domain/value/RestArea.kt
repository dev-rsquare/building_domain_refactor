package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class RestArea(
    private val roofGarden: Boolean,
    private val terrace: Boolean,
    private val etc: Boolean
) {

}
