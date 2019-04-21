# :dizzy: 비선형구조

## 목차
 1. Tree [link](#Tree) 
 1. Graph [link](#Graph) 


<br>
<br>
<hr>


### Tree

* 트리의 정의

자신과 같은 클래스 타입을 변수로 가지고 있고 아래와 같은 트리형태로 되어있는 자료구조. 노드[link](https://github.com/KimUihyeon/DataStructures/blob/master/Tree/MyTree/MyTreeNode.java)(POJO)클래스와 노드를 운용하는 Tree(Management Class)[link]()로 구분해서 구현한다. `힙정렬 혹은 학습을 위해 Binary Tree`가 일반적이지만 `실제협업에서는 노드클래스가 NodeCollection`을 가지고 있게 하는 구조로 많이 개발한다.

대표적인 트리의 종류로는 신장트리, 이진트리, 레드블랙트리.. 등이 있다.


트리를 순회를 `구현`할때에는 크게 `재귀(Recucive)`, `Stack`, `Queue`를 이용해서 구현할수있다. 재귀의 경우 구현은 쉽지만 해당 원하는 값을 검색해서 반환하는경우 반환하는 타이밍을 잡기 어렵고 디버깅을 하기 어렵기 떄문에 활용도가 떨어진다. 따라서 스텍과 큐를 이용해서 구현하는 것을 추천한다. `DFS는 Stack`으로, `BFS는 Queue`로 구현할 수 있다.

* 트리의 순회


1. DFS - 중위 탐색 (in-order) [sourceCode](https://github.com/KimUihyeon/DataStructures/blob/master/Tree/MyTree/MyTree.java#L24)
```
            1
         /     \
        2       3
      /   \   /   \
    4      5 6      7
```
`순회결과 || 4-> 2-> 5-> 1-> 6-> 3-> 7`

2. DFS - 전위 탐색 (in-order) [sourceCode](https://github.com/KimUihyeon/DataStructures/blob/master/Tree/MyTree/MyTree.java#L64)

```
            1
         /     \
        2       3
      /   \   /   \
    4      5 6      7
```
`순회결과 || 1-> 2-> 4-> 5-> 3-> 6-> 7`



3. DFS - 후위 탐색 (post-order) [sourceCode](https://github.com/KimUihyeon/DataStructures/blob/master/Tree/MyTree/MyTree.java#L78)

```
            1
         /     \
        2       3
      /   \   /   \
    4      5 6      7
```
`순회결과 || 1-> 2-> 3-> 4-> 5-> 6-> 7`



4. BFS - 계층 우선 탐색 (in-order) [sourceCode](https://github.com/KimUihyeon/DataStructures/blob/master/Tree/MyTree/MyTree.java#L112)

```
            1
         /     \
        2       3
      /   \   /   \
    4      5 6      7

```
`순회결과 || 1-> 2-> 3-> 4-> 5-> 6-> 7`


