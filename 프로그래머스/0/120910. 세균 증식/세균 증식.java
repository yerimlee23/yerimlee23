class Solution {
    public int solution(int n, int t) {
        int answer = n * 2;
        
        for (int i = 2; i <= t; i++) {
            answer *= 2;
        }
        
        return answer;
    }
}