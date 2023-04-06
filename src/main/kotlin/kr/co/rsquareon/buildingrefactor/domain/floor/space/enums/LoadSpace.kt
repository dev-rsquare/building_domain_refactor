package kr.co.rsquareon.buildingrefactor.domain.floor.space.enums

enum class LoadSpace(
    private val description: String
) {
    INTERIOR("내부"),
    EXTERIOR("외부"),
    MIXED("내부 + 외부"),
}