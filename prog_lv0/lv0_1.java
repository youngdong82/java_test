//------------------------------------------------------ 배열과 리스트 
//배열과 리스트의 차이
//
//배열은 인덱스를 가진 데이터 집합, 메모리에 연속적으로 저장된다.
//list 인덱스 없이 순차적으로 저장됨. 메모리에 분산되어 저장된다.
//
//배열은 랜덤 엑세스가 가능하지만, 중간에 데이터 삽입/삭제가 어렵다.
//리스트는 램덤엑세스가 불가능, 중간에 데이터 삽입/삭제가 쉽다.
//
//리스트는 Linked List로 구현한다.
//java의 ArrayList는 배열과 다르다.

//배열은 크기 할당을 해줘야하고 리스트는 그럴 필요가 없다.
//그러면 리스트가 개꿀인가?
//쓰지 않는 메모리 할당이 많아지기 때문에, 무조건 리스트를 쓰는 것은 비효율.
//크기가 정해진 데이터라면 배열이 더 효율적이다.

//그렇다면 ArrayList란 뭘까...?
//배열과 리스트의 장점들을 합친 것.
//indexing으로 접근 가능하고, 데이터 삽입, 삭제가 가능해서 크기가 가변적이다.


//------------------------------------------------------ 문자열 메소드
//String.length();
//String.substring();

//------------------------------------------------------ 형변환 
//int num1;
//int num2;
//double num3 = (double) num1 / (double)num2;
//(int) (num3 * 100); 다시 int로 변경 

//------------------------------------------------------ for in 반복문 
//int[] array = new Array(3);
//for(int i: array){
//	answer += (i>height) ? 1 : 0;
//}
//return answer;

//------------------------------------------------------ 거꾸로 for문 
//for(int i=0; i<num_list.length; i++){
//	answer[num_list.length -i -1] = num_list[i];
//}






//------------------------------------------------------ 1. 나머지 구하기
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = num1 % num2;
//        return answer;
//    }
//}
//------------------------------------------------------ 2. 숫자 비교하기
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer;
//        if(num1 == num2){
//            answer = 1;
//        }else{
//            answer = -1;
//        }
//        return answer;
//    }
//}
//------------------------------------------------------ 3. 두 수의 차
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = num1 - num2;
//        return answer;
//    }
//}
//------------------------------------------------------ 4. 두수의 곱
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = num1 * num2;
//        return answer;
//    }
//}
//------------------------------------------------------ 5. 두수의 몫
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = num1 / num2;
//        return answer;
//    }
//}
//------------------------------------------------------ 6. 두수의 합
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = num1 + num2;
//        return answer;
//    }
//}
//------------------------------------------------------ 7. 나이 출력
//class Solution {
//    public int solution(int age) {
//        int answer = 2023 - age;
//        return answer;
//    }
//}
//------------------------------------------------------ 8. 각도기
//class Solution {
//    public int solution(int angle) {
//        int answer = 0;
//        if(0<angle && angle<90){answer = 1;}
//        else if(angle==90){answer = 2;}
//        else if(90< angle && angle <180){answer = 3;}
//        else if(angle==180){answer = 4;};
//        return answer;
//    }
//}
//------------------------------------------------------ 9. 두 수의 나눗셈 ***
//class Solution {
//    public int solution(int num1, int num2) {
//        double afterDivide = (double) num1 / (double)num2;
//        return (int) (afterDivde * 1000);
//    }
//}


//----------------------------------------------------- 10. 중복된 숫자 개수
//class Solution {
//public int solution(int[] array, int n) {
//  int answer = 0;
//  for(int i=0; i<array.length; i++){
//      if(array[i] == n){
//          answer++;
//      }
//  }
//  return answer;
//}
//}

//------------------------------------------------------ 11. 짝수의 합
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        for(int i=1; i<=n; i++){
//            if(i%2 == 0){
//                answer += i;
//            }
//        }
//        return answer;
//    }
//}
//------------------------------------------------------ 12. 양꼬치
//class Solution {
//    public int solution(int n, int k) {
//        int answer = 0;
//        int afterDivide = n/10;
//        System.out.println(afterDivide);
//        answer = (n*12000) + ((k-afterDivide)*2000);
//        return answer;
//    }
//}
//------------------------------------------------------ 13. 배열의 평균값 ***
//class Solution {
//    public double solution(int[] numbers) {
//        double answer = 0;
//        for(int i=0; i<numbers.length; i++){
//            answer += numbers[i];
//        }
//        return answer / numbers.length;
//    }
//}

//------------------- 커뮤
//import java.util.Arrays;
//
//class Solution {
//    public double solution(int[] numbers) {
//        return Arrays.stream(numbers).average().orElse(0);
//    }
//}

//------------------------------------------------------ 14. 머쓱이보다 키 큰 사람 ***
//class Solution {
//    public int solution(int[] array, int height) {
//        int answer = 0;
//        for(int i=0; i<array.length; i++){
//            if(array[i]>height){
//                answer += 1;
//            }
//        }
//        return answer;
//    }
//}
//------------------- 커뮤for in, 삼항연산자 
//class Solution {
//    public int solution(int[] array, int height) {
//        int answer = 0;
//        for(int i: array){
//            answer += (i>height) ? 1 : 0;
//        }
//        return answer;
//    }
//}

//------------------------------------------------------ 15. 피자 나눠 먹기(1)
//class Solution {
//    public int solution(int n) {
//        int answer = n/7;
//        int rest = n%7;
//        if(rest != 0){
//            answer += 1;
//        }
//        return answer;
//    }
//}

//------------------------------------------------------ 16. 문자열 뒤집기 ***
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        for(int i=my_string.length()-1; i>=0; i--){
//            answer += my_string.substring(i,i+1);
//        }
//        return answer;
//    }
//}

//------------------------------------------------------ 17. 피자 나눠 먹기(3)
//class Solution {
//    public int solution(int slice, int n) {
//        int answer =  n/slice;
//        int rest = n%slice;
//        if(rest != 0){
//            answer += 1;
//        }
//        return answer;
//        
//    }
//}

//------------------------------------------------------ 18. 배열 뒤집기 ***
//class Solution {
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length];
//        
//        for(int i=0; i<num_list.length; i++){
//            answer[num_list.length -i -1] = num_list[i];
//        }
//        return answer;
//    }
//}

//------------------------------------------------------ 19. 편지 
//class Solution {
//    public int solution(String message) {
//        int answer = (message.length())*2;
//        return answer;
//    }
//}

//------------------------------------------------------ 20. 배열 두 배 만들기
//class Solution {
//    public int[] solution(int[] numbers) {
//        int[] answer = new int[numbers.length];
//        for(int i=0; i<answer.length; i++){
//            answer[i] = (numbers[i]*2);
//        }
//        return answer;
//    }
//}
