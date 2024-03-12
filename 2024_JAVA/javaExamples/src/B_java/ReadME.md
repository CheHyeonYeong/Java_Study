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





## 4번, four()


