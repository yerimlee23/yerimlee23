class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int n = num_list.length;
        
        for (int i = 0; i < num_list.length; i++, n--) {
            answer[i] = num_list[n - 1];
        }
        
        return answer;
    }
}