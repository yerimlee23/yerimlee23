class Solution {
    public int solution(int slice, int n) {
        int div = n % slice;
        int answer = 0;
        
        if (div == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;    
        }
        
        return answer;
    }
}