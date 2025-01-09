# Assignment
기술 과제입니다.

### **1단계 : 요구사항 정의 및 설계**

- 이미 요구사항이 주어졌다면, 구현을 위해 어떤 요구사항이 있는지 숙지해야합니다.
1. **요구사항 정의**
    - 어떤 계산기 기능이 필요한지 명확히 합니다.
    - 예를 들어, 기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈), 괄호 사용, 제곱근, 제곱 등.
    - 사용자 인터페이스 방식 결정 : 콘솔 기반인지, GUI(그래픽 사용자 인터페이스) 기반인지.
    - 예외 처리 : 0으로 나누기와 같은 오류를 어떻게 처리할지 결정합니다.
2. **설계**
    - 클래스 다이어그램: 계산기에 필요한 클래스를 설계합니다. 예를 들어, Calculator, Operation, Parser 등이 될 수 있습니다.
    - 기능 분해: 주요 기능을 메소드로 분리합니다. 예를 들어, add(), subtract(), multiply(), divide(), evaluateExpression() 등.
    - 데이터 흐름 설계: 데이터가 클래스 간에 어떻게 흐를지를 결정합니다. 
    입력, 처리, 출력의 흐름을 이해합니다.

## 4️⃣ **필수 기능 가이드**

1. 계산기를 만들어라
계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.
2. Lv2
계산된 결과 값들을 기록하는 컬렉션을 만든다.
컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.
3. Lv3
양의 정수만 받았지만 이제부터는 실수도 받을 수 있게 수정한다.
결과가 저장되어 있는 컬렉션을 조회하는 기능을 만든다. 그 때 특정 갓보다 큰 결과 값을 출력할 수 있도록

### Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

- [ ]  **양의 정수(0 포함)를 입력받기**
    - [ ]  Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
    - [ ]  양의 정수는 각각 하나씩 전달 받습니다.
    - [ ]  양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        		    System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            }
        }
        ```
        
- [ ]  **사칙연산 기호(➕,➖,✖️,➗)를 입력받기**
    - [ ]  Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
    - [ ]  사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (`charAt(0)`)
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ...
                System.out.print("사칙연산 기호를 입력하세요: ");
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. 
            }
        }
        ```
        
- [ ]  **위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기**
    - [ ]  키워드 : `if` `switch`
    - [ ]  사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
    - [ ]  입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
    - [ ]  연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
        - [ ]  ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
        - 예시 코드
            
            ```java
            public class App {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    ...
                    int result = 0;
                    /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
                    System.out.println("결과: " + result);
                }
            }
            ```
            
- [ ]  **반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기**
    - [ ]  키워드 : 무한으로 반복, 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
    - [ ]  반복문을 사용합니다. (예를 들어, for, while…)
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                /* 반복문 사용 해서 연산을 반복 */
                ...
                System.out.println("결과: " + result);
                
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                /* exit을 입력 받으면 반복 종료 */
            }
        }
        ```
        

### Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

- [ ]  사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    - [ ]  사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    - [ ]  연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    - [ ]  1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
    - 예시 코드
        
        ```java
        public class Calculator {
            /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
        
            public 반환타입 calculate(...매개변수) {
                /* 위 요구사항에 맞게 구현 */
                /* return 연산 결과 */
            }
        }
        ```
        
- [ ]  **Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정**
    - [ ]  연산 수행 역할은 Calculator 클래스가 담당
        - [ ]  연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    - [ ]  소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                /* Calculator 인스턴스 생성 */
        
                Scanner sc = new Scanner(System.in);
        
                /* 반복문 시작 */
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();
        
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
        
                    /* 위 요구사항에 맞게 소스 코드 수정 */
        
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    ...
                /* 반복문 종료 */
            }
        }
        ```
        
- [ ]  **App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)**
    - [ ]  간접 접근을 통해 필드에 접근하여 **가져올** 수 있도록 구현합니다. (Getter 메서드)
    - [ ]  간접 접근을 통해 필드에 접근하여 **수정할** 수 있도록 구현합니다. (Setter 메서드)
    - [ ]  위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.
    - 예시 코드
        
        ```java
        public class Calculator {
        		/* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
        		
            public 반환타입 calculate(...매개변수) {
                ...
            }
            
            /* Getter 메서드 구현 */
            /* Setter 메서드 구현 */
        }
        
        public class App {
            public static void main(String[] args) {
                /* Calculator 인스턴스 생성 */
        
                Scanner sc = new Scanner(System.in);
        
                /* 반복문 시작 */
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();
        
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
        
                    /* 위 요구사항에 맞게 소스 코드 수정 */
        
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    ...
                /* 반복문 종료 */
            }
        }
        ```
        
- [ ]  Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
    - [ ]  키워드 : `컬렉션`
        - [ ]  컬렉션에서 ‘값을 넣고 제거하는 방법을 이해한다.’가 중요합니다!
    - 예시 코드
        
        ```java
        public class Calculator {
        		/* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
        		
            public 반환타입 calculate(...매개변수) {
                ...
            }
            
            ...
            
            public void removeResult() {
                /* 구현 */
            }
        }
        
        public class App {
            public static void main(String[] args) {
                /* Calculator 인스턴스 생성 */
        
                Scanner sc = new Scanner(System.in);
        
                /* 반복문 시작 */
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();
        
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
        
                    /* 위 요구사항에 맞게 소스 코드 수정 */
        
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    ...
                /* 반복문 종료 */
            }
        }
        ```
        
    

## 5️⃣ 도전 기능 가이드

### 3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기

- [ ]  **현재 사칙연산 계산기는 (➕,➖,✖️,➗) 이렇게 총 4가지 연산 타입으로 구성되어 있습니다.**
    - [ ]  Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용 해봅니다.
    - 예시 코드(기존에 작성했던 양의 정수 계산기를 수정)
        
        ```java
        public enum OperatorType {
            /* 구현 */
        }
        
        public class ArithmeticCalculator /* Hint */ {
        		/* 수정 */
        }
        ```
        
- [ ]  **실수, 즉 double 타입의 값을 전달 받아도 연산이 수행하도록 만들기**
    - [ ]  키워드 : `제네릭`
        - [ ]  단순히, 기존의 Int 타입을 double 타입으로 바꾸는 게 아닌 점에 주의하세요!
    - [ ]  지금까지는 ArithmeticCalculator, 즉 사칙연산 계산기는 양의 정수(0 포함)를 매개변수로 전달받아 연산을 수행
    - [ ]  피연산자를 여러 타입으로 받을 수 있도록 기능을 확장
        - [ ]  ArithmeticCalculator 클래스의 연산 메서드(`calculate`)
    - [ ]  위 요구사항을 만족할 수 있도록 ArithmeticCalculator 클래스를 수정합니다. (제네릭)
        - [ ]  추가적으로 수정이 필요한 다른 클래스나 메서드가 있다면 같이 수정 해주세요.
    - 예시 코드(기존에 작성했던 양의 정수 계산기를 수정)
        
        ```java
        public class ArithmeticCalculator /* Hint */ {
        		/* 수정 */
        }
        ```
        
- [ ]  **저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력**
    - [ ]  ArithmeticCalculator 클래스에 위 요구사항을 만족하는 조회 메서드를 구현합니다.
    - [ ]  단, 해당 메서드를 구현할 때 Lambda & Stream을 활용하여 구현합니다.
        - [ ]  Java 강의에서 람다 & 스트림을 학습 및 복습 하시고 적용 해보세요!
    - [ ]  추가) 람다 & 스트림 학습을 위해 여러 가지 조회 조건들을 추가하여 구현 해보시면 학습에 많은 도움이 되실 수 있습니다.

<br><br>
<hr>
<br><br>

# 트러블 슈팅
## 잘못된 연산자 입력 및 다양한 숫자 타입 처리 문제
### 1. 문제 정의
#### 1.1 문제
1. 잘못된 연산자 입력 시, IllegalArgumentException이 발생하며 프로그램이 중단합니다.
2. 기존 Calculator 클래스는 정수(int)형만 처리할 수 있어, 실수(double)형의 연산을 지원하지 못했습니다.
3. 결과 필터링을 위한 기능(예: 특정 값보다 큰 결과 조회)이 없어서 사용자 경험이 제한적이었습니다.

#### 1.2 발생 조건
1. 잘못된 연산자를 입력하면, 프로그램이 비정상 종료
2. double  값으로 연산을 요청하면 처리가 불가능함
3. 사용자가 연산 결과에서 특정 조건에 맞는 값을 필터링 하려고 시도했지만 기능 구현이 되지않았음

#### 1.3 영향
1. 사용자 입력에 대한 예외처리가 미흡해 프로그램이 중단될 가능성이 높앗습니다.
2. 다양한 숫자 타입 연산을 지원하지 못해 기능이 제한적이었습니다.
3. 결과 관리 기능이 없어 프로그램 확장성 및 완성도가 낮앗습니다.

### 2. 원인 분석
#### 2.1 잘못된 연산자 입력 문제
- 원인
OperatorType.fromChar 메서드는 유효하지 않은 연산자를 입력받을 경우 IllegalArgumentException을 던집니다.
이를 처리하는 예외 핸들링 로직이 없어 프로그램이 종료되었습니다.
#### 2.2 숫자 타입 제한 문제
- 원인
기존 Calculator 클래스는 int 타입만 처리하도록 설계되었었습니다.
다양한 숫자 타입(예: double)을 처리할 수 있는 제네릭 설계가 되어 있지 않았습니다.

#### 2.3 결과 필터링 기능 부족
- 원인
기존 코드에는 연산 결과를 조건에 따라 필터링하는 기능이 없었습니다.
이를 처리하기 위한 람다와 스트림 사용이 필요했으며, 이는 기술 과제 3번이었습니다.

### 3. 해결 방안
#### 3.1 잘못된 연산자 입력 문제 해결
- 수정 방법
App 클래스에서 OperatorType.fromChar 호출 시, try-catch 블록으로 잘못된 입력을 처리하도록 함
사용자에게 올바른 연산자 입력을 요청하는 메시지를 추가.

```
OperatorType operator;
while (true) {
    try {
        System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
        char operatorChar = br.readLine().charAt(0);
        operator = OperatorType.fromChar(operatorChar);
        break; // 올바른 연산자를 입력하면 루프 종료
    } catch (IllegalArgumentException e) {
        System.out.println("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.");
    }
}
```

#### 3.2 숫자 타입 제한 문제 해결
- 수정 방법
Calculator 클래스를 제네릭으로 설계하여 다양한 숫자 타입을 처리.
연산을 수행할 때 T extends Number를 통해 모든 숫자 타입을 double로 변환 후 처리.
```
public class ArithmeticCalculator<T extends Number> {
    public double calculate(T num1, T num2, OperatorType operator) {
        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result;

        switch (operator) {
            case ADD -> result = a + b;
            case SUBTRACT -> result = a - b;
            case MULTIPLY -> result = a * b;
            case DIVIDE -> {
                if (b == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = a / b;
            }
            default -> throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
        }
        results.add(result);
        return result;
    }
}
```
#### 3.3 결과 필터링 기능 추가
- 수정 방법
Calculator 클래스에 람다와 스트림을 활용해 조건에 따라 결과를 필터링하는 기능을 추가.
```
public List<Double> getResultsGreaterThan(double threshold) {
    return results.stream()
            .filter(result -> result > threshold)
            .collect(Collectors.toList());
}
```

### 4. 결과 검증
#### 4.1 테스트 시나리오
- 잘못된 연산자 입력 테스트
입력: &, x, #, (
기대 결과: "유효하지 않은 연산자입니다" 메시지가 출력되고 다시 입력 요청.

- 다양한 숫자 타입 처리 테스트
입력: 15.5 + 10.2
기대 결과: 25.7 출력.

- 결과 필터링 테스트
저장된 결과: [10.0, 15.0, 25.0, 30.0]
입력: threshold = 20.0
기대 결과: [25.0, 30.0]

#### 4.2 테스트 결과
모든 테스트 시나리오에서 기대한 대로 동작함.
프로그램 비정상 종료 없이 입력 요청을 반복 처리함.

### 5. 개선 및 학습
#### 5.1 개선 사항
- 예외 처리
사용자 입력의 예외 처리 로직을 추가하여 프로그램 안정성을 높임.
잘못된 입력에 대해 친화적인 안내 메시지를 제공.

- 제네릭 설계
코드 확장성이 향상되었으며, 정수와 실수를 모두 처리 가능.
사실 제네릭 까지는 어떻게 할 수 있었으나, 스트림과 더불어 어떻게 잘 코드에 녹여내며 활용할지 고민을 많이 했었습니다.

- 스트림 활용
조건에 맞는 결과를 효율적으로 필터링하는 기능을 추가.

#### 5.2 학습 내용
- Exception Handling
예외 발생 가능성이 있는 모든 입력 값에 대해 방어적 코드를 작성해야 한다.

- Generic Programming
다양한 숫자 타입을 처리할 수 있도록 설계하면 코드 재사용성과 확장성이 크게 향상됨.

= Lambda & Stream
스트림 API는 조건에 따른 데이터를 처리할 때 간결하고 효과적임.

### 6. 결론
위의 트러블 슈팅 과정을 통해 잘못된 입력 처리, 다양한 숫자 타입 지원, 결과 필터링 기능을 추가하여 프로그램 안정성과 사용자 경험을 아래와 같이 개선할 수 있었습니다. 
#### 6.1 안정성 개선 (약 80%)
- 잘못된 입력 처리 로직 추가로 프로그램 비정상 종료 가능성을 크게 줄였습니다.
- 예외 발생 시, 사용자 친화적인 메시지를 제공하여 예상치 못한 종료 대신 다시 입력받는 로직으로 구현했습니다.
- 다양한 숫자 타입을 처리하도록 설계하여 예상치 못한 타입의 오류를 방지하였습니다.
#### 6.2 사용자 경험 개선 (약 70%)
- 결과 필터링 기능 추가로 사용자가 필요한 정보를 더 쉽게 조회할 수 있게 했습니다.
- 잘못된 입력에 대한 명확한 안내 메시지를 제공하여 사용자 혼란을 줄였습니다.
- 실수 double형 연산 지원으로 다양한 상황에서도 계산기를 활용할 수 있게 하였습니다.

<hr>

### 포부
앞으로도 확장 가능한 설계를 유지하며 결과물이 좋으며 확장가능하며 유지보수가 용이한 프로젝트로 발전시켜 나가겠습니다.



