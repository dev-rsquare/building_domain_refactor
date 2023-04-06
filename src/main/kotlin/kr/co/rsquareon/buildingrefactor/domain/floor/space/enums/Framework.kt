package kr.co.rsquareon.buildingrefactor.domain.floor.space.enums

enum class Framework(
    private val description: String
) {
    REBAR("철근"),
    CONCRETE("콘크리트"),
    BRICK("벽돌"),
    SANDWICH_PANEL("샌드위치 판넬"),
    ETC("기타"),
    UNCHECKED("조사 안 됨")
}