<관리리스트>
* Create - 할 일 만들기(entity 를 고민하는단계)POST/api/items
  아침먹기,스트레칭,수업듣기,저녁먹기,숙제하기
  (Request body)
  {
      "itemname": "아침먹기"
  }

* Read -  할 일 '목록' 읽기 GET/api/items
  할 일 완료 처리
  (어떤 데이터를 가지고 와서 읽을지에 대한 정보필요)

[
    {
        "id": 1,
        "itemname": "아침먹기"
    },
    {
        "id": 2,
        "itemname": "스트레칭"
    }
]

* Update - 할 일 수정하기 PUT/api/items/{id}
  (""수정)
  ()
* Delete - 할 일 삭제하기 DELETE/api/items/{id}
  ("삭제)

*Completed - 완료된 할일 GET/api/todos/complete

//
**완료된 할 일만 모아보기(값 타입 필드로 필터)
-GET/todos
-Query params
++isCompleted
ex)localhost:8080/todos?isCompleted=true
목록에 관계없이 할일검색(값 타입 필드로 필터)
오늘할일만 보기(값타입필드로 필터)
특정리스트의 할일만보기(참조타입필드로필터)

//컨트롤러는 서비스한테 의존하고 서비스는 레퍼지토리한테 의존함