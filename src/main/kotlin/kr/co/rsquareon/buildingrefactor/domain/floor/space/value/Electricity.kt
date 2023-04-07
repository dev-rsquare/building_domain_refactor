package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Electricity(
    @Comment("주 전력량")
    private val main: Double?,

    @Comment("예비 전력량")
    private val backup: Double?
) {
}