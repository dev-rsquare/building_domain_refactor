package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import javax.persistence.Embeddable

@Embeddable
class Rack(
    private val exist: Boolean?,

    private val detail: String?
) {
}