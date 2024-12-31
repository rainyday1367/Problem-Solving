class Solution {
    public String solution(int age) {
        String str_age = age + "";
        String answer = "";
        for(int i = 0; i < str_age.length(); i++){
            switch(str_age.charAt(i)){
                case '0' :
                    answer += "a";
                    break;
                case '1':
                    answer += "b";
                    break;
                case '2':
                    answer += "c";
                    break;
                case '3':
                    answer += "d";
                    break;
                case '4':
                    answer += "e";
                    break;
                case '5':
                    answer += "f";
                    break;
                case '6':
                    answer += "g";
                    break;
                case '7':
                    answer += "h";
                    break;
                case '8':
                    answer += "i";
                    break;
                case '9':
                    answer += "j";
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
}