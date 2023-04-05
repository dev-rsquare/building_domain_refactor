package kr.co.rsquareon.buildingrefactor.domain.floor.value

import kr.co.rsquareon.buildingrefactor.domain.floor.space.Space
import javax.persistence.CascadeType
import javax.persistence.Embeddable
import javax.persistence.OneToMany

@Embeddable
class Spaces(

    @OneToMany(mappedBy = "floor", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val spaces: MutableList<Space> = mutableListOf()
) {
}