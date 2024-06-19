package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 4. 파스칼의 삼각형을 작성하시오. 최종 숫자는 20까지 */
        /* 참고사이트 : https://ittrue.tistory.com/565  */
//        // 7번째에서 20의 값이 나온다.
//        int n = 7;
//
//        int[][] pascal = new int[n][]; // 열의 크기를 미리 지정할 경우 빈 공간에 0이 들어가게 된다.
//        for (int i = 0; i < n; i++) {
//            pascal[i] = new int[i + 1]; // 열의 크기가 반복문을 돌며 점차 증가한다.
//
//            pascal[i][0] = 1; // 행의 첫 시작은 무조건 1로 시작한다.
//            pascal[i][i] = 1; // 행의 마지막은 무조건 1로 끝난다.
//
//            for (int j = 1; j < i; j++) {
//                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]; // 현재 요소는 이전 행의 두 요소의 합으로 정해진다.
//            }
//        }
//
//        // 파스칼의 삼각형 출력
//        for (int i = 0; i < pascal.length; i++) {
//            for (int j = 0; j < pascal[i].length; j++) {
//                System.out.print(pascal[i][j] + " ");
//            }
//            System.out.println();
//        }

        /* 5. 5*5 마방진을 작성하고 처음 숫자 위치가 랜덤하게 들어가게 하시오. */
        /* 참고사이트 : ChatGPT  */
        int size = 5;
        int[][] intArr = new int[size][size];


        // 처음 숫자가 랜덤한 위치에 들어가게 된다.
        int cnt = 1;  // 1부터 시작
        int random1 = (int)(Math.random() * 5); // 0 ~ 4까지의 랜덤한 숫자
        int random2 = (int)(Math.random() * 5); // 0 ~ 4까지의 랜덤한 숫자
        System.out.println("random1의 인덱스 : " +random1);
        System.out.println("random2의 인덱스 : " +random2);



        while (cnt <= size * size) {
            intArr[random1][random2] = cnt;    // 처음 숫자가 랜덤한 위치에 대입
            cnt++;                             // 점차 숫자가 증가

            int newRandom1 = (random1 - 1 + size) % size;  // 마방진 규칙을 위해 사각판을 나간 값의 위치 조정을 위한 변수
            int newRandom2 = (random2 + 1) % size;

            if (intArr[newRandom1][newRandom2] != 0) {     // 다음 위치에 값이 채워져 있는 경우
                random1 = (random1 + 1) % size;            // 아래로 한칸 이동
            } else {
                random1 = newRandom1;                      // 계산된 행 인덱스로 이동
                random2 = newRandom2;                      // 계산된 열 인덱스로 이동
            }
        }

        //출력
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.printf("%3d ",intArr[i][j]);
            }
            System.out.println();
        }

    }







        /* 6. 묵지빠로 야구 게임을 작성하시오.
        * - 컴퓨터를 이기면 1루 진출 지면 스트라이크
        * - 2 스트라이크는 아웃
        * - 3 아웃이면 종료
        * - 종료시 게임의 현황판을 출력
        *  */
        // 유저가 승리시 다음 루로 진출하며 스트라이크 초기화

//        Scanner sc = new Scanner(System.in);
//
//        int userScore = 0;
//        int strikeCount = 0;
//        int baseCount = 0;
//        int outCount = 0;
//
//        int userVictory  = 0;
//        int computerVictory = 0;
//
//        int gameCount = 0;
//
//        label:
//        while(outCount != 3){
//            System.out.println("컴퓨터와 가위바위보를 시작합니다.");
//            System.out.println("1. 가위");
//            System.out.println("2. 바위");
//            System.out.println("3. 보");
//            System.out.print("숫자를 입력해주시길 바랍니다 : ");
//            String input = sc.nextLine();
//
//            // 입력한 값에 대한 유효성 검사
//            if(!input.equals("1") && !input.equals("2") && !input.equals("3")){
//                System.out.println("숫자 1, 2, 3 중에서만 입력을 해주시길 바랍니다.");
//                continue label;
//            }
//
//            int num = Integer.valueOf(input); // 정수값으로 변환
//            int comNum = (int)(Math.random() * 3) + 1;
//
//            System.out.println("내가 낸 숫자 : " + num);
//            System.out.println("컴퓨터가 낸 숫자 : " + comNum);
//            System.out.println();
//            gameCount++; // 게임 횟수 카운트
//
//            // 가위바위보 결과
//            int result = RPSResult(num, comNum);
//            if(result == 1){              // 승리
//                baseCount += 1;           // 다음 베이스 진출
//                strikeCount = 0;          // 스트라이크 초기화
//                userVictory += 1;         // 유저 승리 횟수 +1
//                System.out.println("유저가 승리하여 " + baseCount + "루에 진출하게 됩니다.");
//            } else if (result == 2) {     // 패배
//                strikeCount += 1;         // 스트라이크
//                computerVictory += 1;     // 컴퓨터 승리 횟수 +1
//                System.out.println("컴퓨터가 승리하여 스트라이크 입니다.");
//            } else {
//                // 가위바위보 다시
//                System.out.println("무승부가 되어 다시 한번 가위바위보를 진행합니다.");
//            }
//
//            // 가위바위보 결과 이후 액션
//            if (baseCount == 4){
//                userScore += 1;            // 유저 스코어 증가
//                baseCount = 0;             // 루 초기화
//                strikeCount =0;            // 스트라이크 초기화
//                System.out.println("베이스에 도착하여 점수 1점을 획득하였습니다.");
//                System.out.println("현재 점수는 " + userScore + "점 입니다.");
//            } else if (strikeCount == 2) { // 아웃
//                outCount += 1;             // 아웃 스코어 증가
//                strikeCount = 0;           // 스트라이크 초기화
//
//                System.out.println("2 스트라이크로 인해 아웃 되었습니다.");
//                System.out.println("현재 아웃 스코어는 " + outCount + "점 입니다.");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("게임이 종료되었습니다.");
//        System.out.println("유저의 총 스코어 : "  + userScore);
//        System.out.println("유저가 가위바위보를 이긴 횟수 : "  + userVictory);
//        System.out.println("컴퓨터가 가위바위보를 이긴 횟수 : " + computerVictory);
//        System.out.println("총 게임 횟수 : " + gameCount); // 무승부 포함
//    }
//    // 가위바위보 결과를 구하는 메소드
//    public static int RPSResult(int user, int computer){
//
//        if(user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2){
//            return 1; // 승리
//        } else if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1) {
//            return 2; // 패배
//        }
//        return 0; // 무승부
//    }
}












