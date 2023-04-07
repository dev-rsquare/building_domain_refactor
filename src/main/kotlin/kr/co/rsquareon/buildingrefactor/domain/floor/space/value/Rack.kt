package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

import org.hibernate.annotations.Comment
import javax.persistence.Embeddable

@Embeddable
class Rack(
    @Comment("랙 여부")
    private val exist: Boolean?,

    @Comment("랙 상세")
    private val detail: String?
) {
}