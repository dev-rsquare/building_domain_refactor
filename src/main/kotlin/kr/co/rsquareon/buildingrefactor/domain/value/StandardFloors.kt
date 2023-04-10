package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.CascadeType
import javax.persistence.Embeddable
import javax.persistence.OneToMany

@Embeddable
class StandardFloors(

    @OneToMany(mappedBy = "building", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val standardFloors: MutableList<StandardFloor>
) {


}