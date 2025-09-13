class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        char[] array = {'a','e','i','o','u','A','E','I','O','U'};
        for(char item: array){
            set.add(item);
        }
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                sb.append(stack.pop());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
