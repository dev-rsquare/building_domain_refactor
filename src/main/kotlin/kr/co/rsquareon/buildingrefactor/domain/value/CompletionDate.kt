package kr.co.rsquareon.buildingrefactor.domain.value

import org.hibernate.annotations.Comment
import javax.persistence.Column
import java.time.LocalDate
import javax.persistence.Embeddable

@Embeddable
class CompletionDate(

    @Column(name = "completion_date")
//    //MSH @Comment("완공 연도")
    private val actual: LocalDate,

    @Column(name = "expected_completion_date")
//    //MSH @Comment("예상완공 연도")
    private val expect: LocalDate
) {
}