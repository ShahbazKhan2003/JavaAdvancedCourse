import java.util.Arrays;

public class maxpathsum {
    public static void main(String[] args) {
        int[][] matrix = { {123},
                            {989},
                            {912},
                            {11},
                            {1}};
        // int[][] matrix = { {10, 10 ,2, -13, 20, 4,},
        //                     {1, -9, -81, 30, 2, 5},
        //                     {0, 10, 4, -79, 2 ,-10},
        //                     {1, -5, 2, 20, -11, 4}};
		int n = matrix.length , m = matrix[0].length;

		int[][] dp = new int[n][m];

		for(int i=n-1;i>=0;i--){
			for(int j=m-1;j>=0;j--){
				
				if(i==n-1) dp[i][j] = matrix[i][j];

                else if(j==0){
                    if(m==1) dp[i][j] = matrix[i][j] + dp[i+1][j];

                    else dp[i][j] = matrix[i][j] + Math.max(dp[i+1][j], dp[i+1][j+1]);
                }
				else if(j==m-1){
					dp[i][j] = matrix[i][j] + Math.max(dp[i+1][j], dp[i+1][j-1]);
				}
				else {
					dp[i][j] = matrix[i][j] + Math.max(dp[i+1][j], Math.max(dp[i+1][j+1], dp[i+1][j-1]));
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<m;i++) max = Math.max(max, dp[0][i]);

		
		System.out.println(max);
    }
}
