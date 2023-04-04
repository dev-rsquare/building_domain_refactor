package kr.co.rsquareon.buildingrefactor.domain.value.floor.space

import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("OFFICE")
class Office(
    id: Long = 0L

) : BaseEntity(id) {
}