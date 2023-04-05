package kr.co.rsquareon.buildingrefactor.domain.value

enum class AirConditioner(
    private val description: String
) {

    CENTRAL("중앙 냉방"),
    INDIVIDUAL("개별 냉방"),
    UNCHECKED("조사 안 됨")

}