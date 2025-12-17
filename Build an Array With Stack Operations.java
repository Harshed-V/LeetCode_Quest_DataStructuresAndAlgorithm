class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String>stack = new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            stack.add("Push");
            if(target[j] == i){
                j++;
                if(j==target.length){
                    break;
                }
            }else{
                stack.add("Pop");
            }
        }return stack;
    }
}
