package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.Floor
import javax.persistence.CascadeType
import javax.persistence.Embeddable
import javax.persistence.OneToMany

@Embeddable
class Floors(

    @OneToMany(mappedBy = "building", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val values: MutableList<Floor> = mutableListOf()
) {

    fun getGroundFloorsCount(): Int {
        return this.values.count { it.isGround() }
    }

    fun getUnderGroundFloorsCount(): Int {
        return this.values.count { it.isUnderGround() }
    }


}