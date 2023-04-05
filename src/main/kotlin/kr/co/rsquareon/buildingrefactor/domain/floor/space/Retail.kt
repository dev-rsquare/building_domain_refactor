package kr.co.rsquareon.buildingrefactor.domain.floor.space

import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("RETAIL")
class Retail(
    id: Long = 0L

) : BaseEntity(id) {
}