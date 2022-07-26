import java.util.Random;
import java.util.Scanner;

public class BaseBallGame4 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int com1, com2, com3, com4;
        int user1 = 1, user2 = 3, user3 = 6, user4 = 0;

        int randomCnt = 0;
        int gameCount = 0;//게임 카운트
        int strikeCnt=0, ballCnt=0;//스크라이크,볼 카운트

        //중복되지 않는 4개의 난수생성
        while(true) {
            //0~9사이의 난수생성
            com1 = random.nextInt(100) % 9;
            com2 = random.nextInt(100) % 9;
            com3 = random.nextInt(100) % 9;
            com4 = random.nextInt(100) % 9;

            if(!(com1==com2 || com1==com3 || com1==com4 || com2==com3 || com2==com4 || com3==com4)) {
                //중복되지 않는 난수 생성에 성공하면 루프탈출
                break;
            }
        }
        System.out.println(randomCnt+"회 만에 생성한 난수:"+com1+" "+com2+" "+com3+" "+com4);

        while(true){

            gameCount++;

            if (com1==user1) strikeCnt++;
            if (com1==user1) strikeCnt++;
            if (com1==user1) strikeCnt++;
            if (com1==user1) strikeCnt++;


        }
    }
}