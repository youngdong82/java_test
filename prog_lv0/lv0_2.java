//------------------------------------------------------ 문자열 변환
// .replace(바꾸고 싶은 문자, 바뀔 문자)
// .replaceAll(정규식, 바뀔 문자)
// .replaceFirst(정규식, 바뀔 문자)
// .split()
// .repeat(반복 횟수)

//------------------------------------------------------ sort
// import java.util.Arrays;

// Arrays.sort(배열);

//------------------------------------------------------ 1. 특정 문자 제거하기
// class Solution {
//     public String solution(String my_string, String letter) {
//         String answer = my_string.replaceAll(letter,"");
//         return answer;
//     }
// }

//------------------------------------------------------ 2. 삼각형의 완성조건 (1)
// class Solution {
//     public int solution(int[] sides) {
//         int maxIdx = 0;
        
//         for(int i=0; i<3; i++){
//             if(sides[i] > sides[maxIdx]){
//                 maxIdx = i;
//             }
//         }
//         int rest = 0;
//         for(int i=0; i<3; i++){
//             if(i != maxIdx){
//                 rest += sides[i];
//             }
//         }
        
//         int answer = 0;
//         if(rest > sides[maxIdx]){
//             answer = 1;
//         }else{
//             answer = 2;
//         }
//         return answer;
//     }
// }
// ------------------------------------- 커뮤
// import java.util.Arrays;

// class Solution {
//     public int solution(int[] sides) {
//         int answer = 0;
//         Arrays.sort(sides);
//         return sides[2] >= sides[0]+sides[1] ? 2 : 1;
//     }
// }
//------------------------------------------------------ 3. 점의 위치 구하기
// class Solution {
//     public int solution(int[] dot) {
//         int answer = 0;
//         if(dot[0] >0){
//             if(dot[1] >0){
//                 answer = 1;
//             }else{
//                 answer = 4;
//             }
//         }else{
//             if(dot[1] >0){
//                 answer = 2;
//             }else{
//                 answer = 3;
//             }
//         }
//         return answer;
//     }
// }
//------------------------------------------------------ 4. 문자 반복 출력하기
// class Solution {
//     public String solution(String my_string, int n) {
//         String answer = "";
//         String[] stringArray = my_string.split("");
//         for(int i=0; i<stringArray.length; i++){
//             answer += stringArray[i].repeat(n);
//         }
//         return answer;
//     }
// }
//------------------------------------------------------ 5. 짝수 홀수 개수
// class Solution {
//     public int[] solution(int[] num_list) {
//         int count1 = 0;
//         int count2 = 0;
//         for(int i: num_list){
//             if(i%2 == 0){
//                 count1++;
//             }else{
//                 count2++;
//             }
//         }
//         int[] answer = {count1, count2};
//         return answer;
//     }
// }
//------------------------------------------------------ 6.
//------------------------------------------------------ 7.
//------------------------------------------------------ 8.
//------------------------------------------------------ 9.
//------------------------------------------------------ 10.
//------------------------------------------------------ 11.
//------------------------------------------------------ 12.
//------------------------------------------------------ 13.
//------------------------------------------------------ 14.
//------------------------------------------------------ 15.
//------------------------------------------------------ 16.
//------------------------------------------------------ 17.
//------------------------------------------------------ 18.
//------------------------------------------------------ 19.
//------------------------------------------------------ 20.
