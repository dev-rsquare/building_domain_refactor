package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable
import org.hibernate.annotations.Comment
import javax.persistence.Column

@Embeddable
class Elevator(

    @Column(name = "elevator_for_freight")
    @Comment("화물용 엘리베이터 개수")
    private val forFreight: Int?,

    @Column(name = "elevator_for_people")
    @Comment("승객용 엘리베이터 개수")
    private val forPeople: Int?
) {

}
