package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.CollectionTable
import javax.persistence.Column
import javax.persistence.ElementCollection
import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

@Embeddable
class StandardFloors(

    @OneToMany
    private val standardFloors: MutableList<StandardFloor>
) {


}