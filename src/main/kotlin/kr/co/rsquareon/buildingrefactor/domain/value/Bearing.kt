package kr.co.rsquareon.buildingrefactor.domain.value

enum class Bearing(
    private val description: String
) {

    NORTH("북"),
    NORTH_EAST("북동"),
    NORTH_WEST("북서"),
    SOUTH("남"),
    SOUTH_EAST("남동"),
    SOUTH_WEST("남서"),
    EAST("동"),
    WEST("서"),
    UNCHECKED("조사 안 됨")
}