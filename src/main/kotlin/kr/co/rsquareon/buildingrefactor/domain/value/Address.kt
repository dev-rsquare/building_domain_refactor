package kr.co.rsquareon.buildingrefactor.domain.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Address(
    @Comment("도로명 주소")
    private val street: String,

    @Comment("지번 주소")
    private val landLot: String
) {
}