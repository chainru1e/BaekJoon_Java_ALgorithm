import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class FourthDot{
    public static void main(String args[]) throws Exception{
        // int appearNum = 0;
        // int appearNum1 = 0;
        int frequency = 0;
        int frequency1 = 0;
        // int temp = -1;
        // int temp1 = -1;

        ArrayList rightAnswer = new ArrayList<>();
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int[][] array = new int[3][2];
        // 왜 이중 포문으로 이차원 배열에 입력하는지 설명해봐
        // 그 이유는 이중 포문이 이차원 배열의 1행>2행... 순으로 입력하기 용이하기 때문!: 더 간단하고 직관적으로 설명해보라!
        for(int i = 0;i<3;i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for(int j = 0;j<2;j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            } 
        }

        for(int i = 0; i<3; i++){   // 참고로 python에는 증감 연산자가 없다.
            for(int j =0; j<3; j++){   // j가 3인 이유는 3 combination 2는 3이기 때문이다? 
                if(array[i][0] == array[j][0]){
                    frequency++;
                }
            }
            if(frequency == 1){
                rightAnswer.add(array[i][0]);
                break;  // break문은 가장 바깥쪽의 반복문을 종료하는가? 아니면 가까운 반복문을 종료하는가?
                //  참고로 지금 케이스는 일단 해당되지 않는이야기이며 설명하자면 가장 가까운 천장만 부신다.
            }
            // temp = array[i];
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                if(array[i][1] == array[j][1]){
                    frequency1++;
                }
            }
            if(frequency1==1){
                rightAnswer.add(array[i][1]);
                break;
            }
        }

        System.out.println(rightAnswer.get(0) + ""+ rightAnswer.get(1));
    }
}
