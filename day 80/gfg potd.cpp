    int isPossible(int N , int coins[]) 
    {
        vector<vector<int>> dp(N+1,vector<int>(2025,0));
        for(int i = 20;i<2025;i+=20){
            dp[N][i]=1;
        }
        for(int j =24;j<2025;j+=24){
            dp[N][j]=1;
        }
        dp[N][2024]=1;
        for(int i=N-1;i>-1;i--){
            for(int j =0;j<2025;j++){
                int high = 0;
                int low = 0;
                low = dp[i+1][j];
                if(coins[i]+j<2025){
                    high=dp[i+1][j+coins[i]];
                }
                dp[i][j]=max(high,low);
            }
        }
        return dp[0][0];
    }
