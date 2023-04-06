package kr.co.rsquareon.buildingrefactor.domain.floor.space.enums

enum class Facility(
    private val description: String
) {
    OFFICE("사무실"),
    SHOWER_ROOM("샤워실"),
    RESTAURANT("식당"),
    LOUNGE("휴게실"),
    MEETING_ROOM("회의실"),
    NIGHT_DUTY_ROOM("숙직실"),
    ETC("기타")
}