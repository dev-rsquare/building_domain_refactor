package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class ToiletForUnisex(
    private val toiletForUnisex: Boolean
) {

}
