# HashMapBasic

HashMap은 Key by Value 형태로 데이터를 저장하여 Key값을 통해 Value를 빠르게 탐색할 수 있다. 
시간복잡도는 get()과 push()의 동작과 일치하며 O(1)의 복잡도를 가진다.

How use this?
HashMap 인스턴스를 만든 다음 put() 메소드를 통해 productPrice에 Key와 Value를 삽입한다.
그리고 get() 메소드에 Key를 입력해 가지고 있는 해당 Value를 가져올 수 있다.

1. print all the keys
모든 Key를 가져오기 위해서 Set 인터페이스에 productPrice.keySet()를 담고
for문과 forEach문을 통해 모든 Key를 불러온다.

2. print all the values
values() 메소드를 통해 인스턴스의 Value를 추출하고 forEach를 통해 모든 Value를 출력한다.

3. print all the key and value
entrySet() 메소드를 이용해서 몯ㄴ 데이터를 한번식 접근하여 Key와 Value를 가져온다.
