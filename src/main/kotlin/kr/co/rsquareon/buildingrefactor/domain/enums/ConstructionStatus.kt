package kr.co.rsquareon.buildingrefactor.domain.enums

enum class ConstructionStatus(
    private val description: String,
) {

    CONSTRUCTION_SCHEDULED("공사 예정"),
    UNDER_CONSTRUCTION("건설중"),
    COMPLETION_SCHEDULED("완공 예정"),
    COMPLETED("완공됨"),
    DEMOLITION_SCHEDULED("철거 예정"),
    DEMOLISHED("철거됨"),
    UNCHECKED("조사 안 됨")
}
