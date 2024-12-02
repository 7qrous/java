package _05_reference_type.example;

public class ArrayInArrayEx {
    public static void main(String[] args) {
        // 2차원 배열 선언, 2줄 3칸짜리로 생성
        /*
         *   |---|---|---|
         *   |100| 90| 80|
         *   |---|---|---|
         *   | 75| 60| 50|
         *   |---|---|---|
         * */
        int mathScores[][] = new int[2][3];
        mathScores[0][0] = 100;
        mathScores[0][1] = 90;
        mathScores[0][2] = 80;
        mathScores[1][0] = 75;
        mathScores[1][1] = 60;
        mathScores[1][2] = 50;
        for (int i = 0; i < mathScores.length; i++) {//2
            for (int j = 0; j < mathScores[i].length; j++) {//3
                System.out.println("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
            }
        }
        /*
         *   |---|---|---|
         *   | 90| 80| 70|
         *   |---|---|---|
         *   | 65|100| 70|
         *   |---|---|---|
         * */
        int engScores[][] = {{90, 80, 70}, {60, 100, 70}};
        for (int i = 0; i < engScores.length; i++) {//2
            for (int j = 0; j < engScores[i].length; j++) {//3
                System.out.println("engScores[" + i + "][" + j + "] : " + engScores[i][j]);
            }
        }
        /*  \ j 0   1   2   3   4
         *  i|---|---|---|---|---|
         *  0|  1|  2|  3|  4|  5|
         *   |---|---|---|---|---|
         *  1|  6|  7|  8|  9| 10|
         *   |---|---|---|---|---|
         *  2| 11| 12| 13| 14| 15|
         *   |---|---|---|---|---|
         *  3| 16| 17| 18| 19| 20|
         *   |---|---|---|---|---|
         *  4| 21| 22| 23| 24| 25|
         *   |---|---|---|---|---|
         * */
        int numbers[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int i = 0; i < numbers.length; i++) { //5
            for (int j = 0; j < numbers[i].length; j++) {//5
                System.out.println(numbers[i][j]);
            }
        }

    }
}
