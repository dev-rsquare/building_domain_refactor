package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

enum class Berth(
    private val description: String
) {
    SINGLE_FLOOR("단일 접안"),
    ALL_FLOOR("전층 접안")
}