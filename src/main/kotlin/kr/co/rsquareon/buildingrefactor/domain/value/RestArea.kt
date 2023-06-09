package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable
import org.hibernate.annotations.Comment
import javax.persistence.Column

@Embeddable
class RestArea(

    @Comment("옥상정원 존재 여부")
    private val roofGarden: Boolean,

    @Comment("테라스 존재 여부")
    private val terrace: Boolean,

    @Column(name = "etc_rest_area")
    @Comment("기타 휴식공간 여부")
    private val etc: Boolean
) {

}
