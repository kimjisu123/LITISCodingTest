package main.java;

public class Main {
    public static void main(String[] args) {

        /* 4. 파스칼의 삼각형을 작성하시오. 최종 숫자는 20까지 */
        /* https://ittrue.tistory.com/565 참고하였습니다. */
        // 7번째에서 20의 값이 나온다.
        int n = 7;

        int[][] pascal = new int[n][]; // 열의 크기를 미리 지정할 경우 빈 공간에 0이 들어가게 된다.
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1]; // 열의 크기가 반복문을 돌며 점차 증가한다.

            pascal[i][0] = 1; // 행의 첫 시작은 무조건 1로 시작한다.
            pascal[i][i] = 1; // 행의 마지막은 무조건 1로 끝난다.

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]; // 현재 요소는 이전 행의 두 요소의 합으로 정해진다.
            }
        }

        // 파스칼의 삼각형 출력
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        /* 5. 5*5 마방진을 작성하고 처음 숫자 위치가 랜덤하게 들어가게 하시오. */


        /* 6. 묵지빠로 야구 게임을 작성하시오.
        * - 컴퓨터를 이기면 1루 진출 지면 스트라이크
        * - 2 스트라이크는 아웃
        * - 3 아웃이면 종료
        * - 종료시 게임의 현황판을 출력
        *  */

    }
}