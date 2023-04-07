package kr.co.rsquareon.buildingrefactor.domain.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Location(
    @Comment("위도")
    private val latitude: Double,

    @Comment("경도")
    private val longitude: Double,

    @Comment("좌표")
    private val geometry: String
) {

}
