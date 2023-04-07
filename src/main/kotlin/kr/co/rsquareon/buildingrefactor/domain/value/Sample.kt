package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class Sample(
    private val data: String
) {

}
