package kr.co.rsquareon.buildingrefactor.domain.enums

enum class Openable(
    private val description: String
) {

    POSSIBLE("가능"),
    IMPOSSIBLE("불가능"),
    NEGOTIABLE("협의 가능"),
    UNCHECKED("조사 안 됨")
}