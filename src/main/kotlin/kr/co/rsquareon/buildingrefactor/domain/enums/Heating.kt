package kr.co.rsquareon.buildingrefactor.domain.enums

enum class Heating(
    private val description: String
) {

    CENTRAL("중앙 난방"),
    INDIVIDUAL("개별 난방"),
    UNCHECKED("조사 안 됨")
}