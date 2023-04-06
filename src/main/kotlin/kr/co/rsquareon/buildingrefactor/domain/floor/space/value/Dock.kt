package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Dock(
    private val count: Int?,

    private val levelerCount: Int?
) {

}