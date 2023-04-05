package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
class Construction(

    @Enumerated(EnumType.STRING)
    private val constructionStatus: ConstructionStatus,
) {

}
