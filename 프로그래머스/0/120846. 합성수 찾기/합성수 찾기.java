class Solution {
    public static int solution(int n) {
        int cnt = 0;
        for (int i=1; i<=n; i++) {
            int innerCnt = 0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) innerCnt++;
            }
            if (innerCnt>=3) cnt++;
        }
        return cnt;
    }
}