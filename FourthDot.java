import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class FourthDot{
    public static void main(String args[]) throws Exception{
        int appearNum = 0;
        int appearNum1 = 0;
        int frequency = 0;
        int frequency1 = 0;
        int temp = -1;
        int temp1 = -1;

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

        for(int i = 0; i<3; i++){
            if(temp == array[0][0] || temp == array[1][0] || temp == array[2][0]){
                frequency ++;
                // 빈도와 그 숫자를 연결하는게 필요한데...
                
            }
            temp = array[i];
        }

        if(frequency == 1){
            rightAnswer.add(appearNum);
        }
    }
}