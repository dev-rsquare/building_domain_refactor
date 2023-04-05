package kr.co.rsquareon.buildingrefactor.domain.value

import java.time.LocalDate
import javax.persistence.Embeddable

@Embeddable
class CompletionDate(
    private val actual: LocalDate,

    private val expect: LocalDate
) {
}