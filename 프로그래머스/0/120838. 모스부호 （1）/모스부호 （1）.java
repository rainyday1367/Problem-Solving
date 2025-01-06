class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] alphaArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int ascii = 97;
        String[] letterArray = letter.split(" ");
        for(int i = 0; i < letterArray.length; i++){
            for(int j = 0; j < alphaArray.length; j++){
                if(letterArray[i].equals(alphaArray[j])){
                    answer += (char)(j + ascii);
                }
            }
        }
        return answer;
    }
}