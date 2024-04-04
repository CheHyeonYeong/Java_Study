### 요구사항 정의:

1. 고객의 정보: 이름, 성별, 이메일, 출생년도
2. 고객 정보는 입력을 받아서 배열(정적 저장공간)에 저장합니다.
3. 고객 정보 저장 형식
    - 이름: 문자열로 저장
    - 성별: 문자로 남자는 'M', 여자는 'F'로 저장
    - 이메일: 문자열로 저장
    - 출생년도: 정수로 저장

### 고객 관리 프로그램 기능:

1. 고객 정보를 저장 : insertCustomerData()
2. 고객 정보를 조회 : printCustomerData(int index)
3. 고객 정보를 수정 : updateCustomerData(int index)
4. 고객 정보를 삭제 : deleteCustomerData(int index)

### 인터페이스 설정(메뉴):

1. "(1)"을 입력하여 고객 정보를 입력 받음.
2. "P(p)(이전)/N(n)(다음)"을 사용하여 저장된 고객의 정보를 조회.
3. "U(u)"는 조회한 고객 정보를 수정.
4. "D(d)"는 조회한 고객 정보를 삭제.
5. "0(9)"는 프로그램 종료.