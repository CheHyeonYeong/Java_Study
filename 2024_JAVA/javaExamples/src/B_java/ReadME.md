# [B_QuizStar코드 설명](https://github.com/CheHyeonYeong/Java_Study/blob/main/2024_JAVA/Quiz/src/week01/B_QuizStar.java)

## 1번, one()
```
*
**
***
****
*****
```
- 하나씩 증가해서 출력함

## 2번, two()
```
*****
****
***
**
*
```
- 하나씩 감소시키면 된다. 

### code
``` java
private static void two() {
		System.out.println("2번");
	    for (int i = 5; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
```

## 3번, three()

```
     *
    **
   ***
  ****
 *****
```
- 패턴을 파악해보자
	- 첫번째 줄 : 공백 4개 + 별 1개
	- 두번째 줄 : 공백 3개 + 별 2개
	- 세번째 줄 : 공백 2개 + 별 3개
	- 네번째 줄 : 공백 1개 + 별 4개
	- 다섯번째 줄 : 공백 0개 + 별 5개
- 패턴
	- 공백 : 단 수 -1~0개까지 => for문으로 구현
	- 별 : 단수 1~단 수개까지 => for문으로 구현
```java
	private static void three() {
		System.out.println("3번");
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }	   	
	}
```

## 4번, four()
```
*****
 ****
  ***
   **
    *
```
- 위와 동일하나, 반대로 하면 된다.

```java

	private static void four() {
		System.out.println("4번");
		for (int i = 1; i <= 5; i++) {

            for (int k = 1; k < i; k++) {
            	System.out.print(" ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                
                System.out.print("*");
            }
            System.out.println();
        }	   	
	}

```


## 5번
```
     *
    ***
   *****
  *******
 *********
```


- 패턴을 파악해보자
	- 첫번째 줄 : 공백 4개 + 별 1개
	- 두번째 줄 : 공백 3개 + 별 3개
	- 세번째 줄 : 공백 2개 + 별 5개
	- 네번째 줄 : 공백 1개 + 별 7개
	- 다섯번째 줄 : 공백 0개 + 별 9개
- 패턴
	- 공백 : 단 수-1~0개까지 => for문으로 구현
	- 별 : 단수 1~(단수)*2-1개까지 => for문으로 구현

```java

	private static void five() {
		System.out.println("5	번");
		for (int i =0;i<5;i++) {
			for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2 +1; k++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}
```

## 6번
```
*********
 *******
  *****
   ***
    *
```
- 위와 동일하나, 반대로 하면 된다.
```java

	private static void six() {
	    System.out.println("6번");
	    for (int i = 5; i >= 1; i--) {
	        for (int j = 1; j <= 5 - i; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= (i * 2) - 1; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
```


# [Diamond 출력 예제](https://github.com/CheHyeonYeong/Java_Study/blob/main/2024_JAVA/Quiz/src/week01/B_QuizDiamond.java)



## diamond


```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

1.  5번, 6번을 겹쳐서 구현
	```java
	static void diamond() {
		int size = 5; // 별의 최대 개수
		System.out.println("diamond 출력");

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}
	```
2. flag 기법 == boolean 알고리즘, 특정 내용만 바뀌게 할 수 있다.
	- 전체 단의 중앙을 기준으로 삼각형을 만드느냐, 역삼각형을 만드느냐가 달라지기 때문에 flag를 통해 반전을 시키는 알고리즘이다.
	- sp : 여백
		- 삼각형일 때 여백 : 4->3->2->1->0(반전되는 시점)
		- 역삼각형일 때 여백 : (반전되는 시점)0->1-> 2->3....
	- st : 별
		- 삼각형일 때 별 : 1->3->5->...
		- 역삼각형일 때 별 : ....->5->3->1
	- 위 두 결과를 통해 여백은 전체 단수//2(int), 별은 1부터 시작함을 알 수 있고, 반전 시점부터 여백은 -1씩 별은 -(2*i-1)만큼 증가함을 알 수 있다.
	- 이를 토대로 알고리즘을 짜면 다음과 같다.


	```java
    static void flagArg() {
        Scanner s = new Scanner(System.in);
        //줄 수를 입력받는 부분
        System.out.println("줄 수를 입력해주세요, 짝수일 경우 어그러집니다. : ");
        int dan = s.nextInt();
        int sp = dan /2; //여백
        int st =1; //별
        boolean flag = true; //true : 삼각형, false : 역삼각형

        for (int i = 0;i<dan ;i++){
            for(int j =0; j<sp;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<st;j++){
                System.out.print("*");
            }
            System.out.println();
            
			if(i==(dan/2)){flag= false;}

            if(flag){sp -=1; st +=2;}
            else{sp+=1;st-=2;}
            System.out.println();
        }
        s.close();
    }
	```


## plainDiamond

```
    *

   *  *

  *    *

 *      *

*        *

 *      *

  *    *

   *  *

    *

```

```java
    static void plaindiamond(){
        Scanner s = new Scanner(System.in);
        //줄 수를 입력받는 부분
        System.out.println("줄 수를 입력해주세요, 짝수일 경우 어그러집니다. : ");
        int dan = s.nextInt();
        int sp = dan /2; //여백
        int st =1; //별
        boolean flag = true; //true : 삼각형, false : 역삼각형
        for (int i = 0;i<dan ;i++){

            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            if (i == 0 || i == dan - 1) {
                System.out.println("*");
            } 
            else {
                System.out.print("*");
                for (int j = 0; j < st - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");   
            }
            if(i==(dan/2)){flag= false;}
            if(flag){sp -=1; st +=2;}
            else{sp+=1;st-=2;}
            System.out.println();
        }
        s.close();

    }

```


## dalerDiamond
```
    *
   * *
  * $ *
 * $ $ *
* $ $ $ *
 * $ $ *
  * $ *
   * *
    *
```

```java

    static void dalerdiamond(){
        
        Scanner scna = new Scanner(System.in);
        //줄 수를 입력받는 부분
        System.out.println("줄 수를 입력해주세요, 짝수일 경우 어그러집니다. : ");
        int line = scna.nextInt();
        int sp = line /2; //여백
        int st =1; //별
        boolean flag = true; //true : 삼각형, false : 역삼각형

        
        for (int i = 0;i<line ;i++){
			// 여백처리... 
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			// 별찍기... 
			for (int j = 0; j < st; j++) {
				if(j == 0 || j == st -1)
					System.out.print("*");
				else {
					if (j%2 == 0) System.out.print("$");
					else System.out.print(" ");
				}
			}
			System.out.println();
			if(i == (line/2)) flag = false; //반전
			if(flag) {
				sp -= 1; st += 2;
			}else {
				sp += 1; st -= 2;
			}
        }
        
        scna.close();


    }
```