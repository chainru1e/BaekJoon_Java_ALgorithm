import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthDot{
    public static void main(String args[]) throws Exception{
        int appearNum = 0;
        int appearNum1 = 0;
        
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
    }
}