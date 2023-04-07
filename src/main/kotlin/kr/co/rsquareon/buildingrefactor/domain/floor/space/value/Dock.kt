package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Dock(
    @Comment("도크 개수")
    private val count: Int?,

    @Comment("레벨러 개수")
    private val levelerCount: Int?
) {

}