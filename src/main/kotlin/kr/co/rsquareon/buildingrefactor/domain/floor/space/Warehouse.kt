package kr.co.rsquareon.buildingrefactor.domain.floor.space

import kr.co.rsquareon.buildingrefactor.util.BaseEntity
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("WAREHOUSE")
class Warehouse(

    private val dock: String,

    private val ramp: String,

    id: Long = 0L

) : BaseEntity(id) {
}