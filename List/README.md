# :leaves: 선형구조

## 목차
 1. 일반 리스트 (Java->ArrayList | C# ->List) [link](#ArrayList) 
 1. 연결리스트 (Linked List)  [link](#) 
 1. 큐 ()  [link](#) 
 1. 스텍 (stack)  [link](#) 
 1. 데큐 [link](#) 

<br>
<br>

<hr>

### ArrayList

[openJDK Link](#) | [sourceCode](#) | [자세히 보기](#) 
    
ArrayList 내부적으로 size 10의 배열을 Defualt로 생성해서사용하고 추가될 데이터의 인덱스가 현재 배열의 사이즈보다 큰 경우배열을 Growth factor(a) 만큼 곱한값으로 새 배열의 크기를지정하고 기존값을 복사해 채워넣는다.  Growth factor(성장인자)a는 다음표와 같다.



| Implementation |  Growth factor (a) |
|:---------------|:-------------------|
|Java ArrayList  |	1.5 (3/2)         |
|Python PyListObject| ~1.125 (n + n >> 3)|
|Microsoft Visual C++ 2013|	1.5 (3/2)|
|G++ 5.2.0                |	2         |
|Clang 3.6                |	2         |
|Facebook folly/FBVector  |	1.5 (3/2) |

`표 출처 Dynamic Array Wikipedia [link](https://en.wikipedia.org/wiki/Dynamic_array)`[link](https://en.wikipedia.org/wiki/Dynamic_array)


그러므로 내부적인 사이즈는 10-> 15-> 22 ... 순으로 1.5배씩커지게 되어있다. 따라서 많은 양의 데이터를 삽입하는 경우는 add로반복문을 돌리는것보단 addAll을 사용하는 것이 내부적으로 값복사가 한번만 일어나기 때문에 효율성이 좋다.

ArrayList의 최대 사이즈는 Integer.MAX_VALUE (0x7fffffff)를넘을수 없고, OS나 IDE에서 할당한 최대 메모리까지만 허용가능하다.


`스터디 구현 Interface `

* Iterator  [jdk8 docs link](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html) | [link](https://github.com/KimUihyeon/DataStructures/blob/master/List/studyInterface/Iterator.java)
    
    * hasNext();
    * next();
    * remove();  | 미구현

* List [jdk8 docs link](https://docs.oracle.com/javase/8/docs/api/java/util/List.html) | [link](https://github.com/KimUihyeon/DataStructures/blob/master/List/studyInterface/List.java)

    * add();
    * addAll();
    * get();
    * contain();
    * indexOf();
    * remove();
    * size();
    * clear();

<br>
<br>

<hr>

### LinkedList
> 참고 블로그 [link](https://github.com/KimUihyeon/Utility/tree/master/MailService) 


<br>
<br>