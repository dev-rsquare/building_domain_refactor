package kr.co.rsquareon.buildingrefactor.domain.value

import kr.co.rsquareon.buildingrefactor.domain.floor.Floor
import javax.persistence.CascadeType
import javax.persistence.Embeddable
import javax.persistence.OneToMany

@Embeddable
class Floors(

    @OneToMany(mappedBy = "building", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val floors: MutableList<Floor>
) {

    fun getGroundFloorsCount(): Int {
        return this.floors.count { it.isGround() }
    }

    fun getUnderGroundFloorsCount(): Int {
        return this.floors.count { it.isUnderGround() }
    }


}