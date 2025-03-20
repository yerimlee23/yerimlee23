class Solution {
    public int solution(int n) {
        int remain = n % 7;
        int answer = 0;
        
        if (remain == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        
        return answer;
    }
}