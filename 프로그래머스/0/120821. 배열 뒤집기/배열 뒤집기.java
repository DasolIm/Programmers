class Solution {
    public int[] solution(int[] num_list) {
        int [] new_list = new int[num_list.length];
        for (int i=0; i< num_list.length; i++) {
            new_list[num_list.length -1 -i] = num_list[i];    
        }
        return new_list;
    }
}