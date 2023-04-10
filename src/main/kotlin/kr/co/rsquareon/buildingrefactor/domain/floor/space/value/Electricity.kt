package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Electricity(
    //MSH @Comment("주 전력량")
    private val main: Double?,

    //MSH @Comment("예비 전력량")
    private val backup: Double?
) {
}