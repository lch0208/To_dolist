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



