package kr.co.rsquareon.buildingrefactor.domain.value

import javax.persistence.Embeddable

@Embeddable
class Benefit(
    private val numberOfMonth: NumberOfMonth,

    private val maintenanceIncluded: Boolean,
) {
}