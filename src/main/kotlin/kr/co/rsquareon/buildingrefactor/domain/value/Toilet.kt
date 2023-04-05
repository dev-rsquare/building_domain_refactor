package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class Toilet(

    @Embedded
    @AttributeOverride(name = "toiletForUnisex", column = Column(name = "toilet_each_space"))
    private val eachSpace: ToiletForUnisex,

    @Embedded
    @AttributeOverride(name = "toiletForUnisex", column = Column(name = "toilet_on_floor"))
    private val onFloor: ToiletForUnisex,

    @Embedded
    @AttributeOverride(name = "toiletForUnisex", column = Column(name = "toilet_between_floors"))
    private val betweenFloors: ToiletForUnisex,
) {

}
