package kr.co.rsquareon.buildingrefactor.domain.value

import org.hibernate.annotations.Comment
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class Toilet(

    @Embedded
    @Comment("공간 내부 화장실 남녀공용 여부")
    @AttributeOverride(name = "toiletForUnisex", column = Column(name = "unisex_toilet_each_space"))
    private val eachSpace: ToiletForUnisex,

    @Embedded
    @Comment("외부 층별 화장실 남녀공용 여부")
    @AttributeOverride(name = "toiletForUnisex", column = Column(name = "unisex_toilet_on_floor"))
    private val onFloor: ToiletForUnisex,

    @Embedded
    @Comment("외부 층간 화장실 남녀공용 여부")
    @AttributeOverride(name = "toiletForUnisex", column = Column(name = "unisex_toilet_between_floors"))
    private val betweenFloors: ToiletForUnisex,
) {

}
