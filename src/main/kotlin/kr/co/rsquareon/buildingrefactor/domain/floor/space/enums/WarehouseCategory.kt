package kr.co.rsquareon.buildingrefactor.domain.floor.space.enums

enum class WarehouseCategory(
    private val description: String
) {
    STORAGE("물류 창고"),
    CENTER("물류 센터"),
    TERMINAL("물류 터미널"),
    FACTORY("물류창고 공장"),
    LAND("토지"),
    BONDED("보세"),
    ETC("기타")
}