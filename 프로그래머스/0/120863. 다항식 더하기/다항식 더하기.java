class Solution {
    public String solution(String polynomial) {
        String[] splitPoly = polynomial.split(" ");
        String answer = "";
        int cnt = 0;
        int num = 0;
        char x = 'x';
        
        for (int i = 0; i < splitPoly.length; i++){
           if (splitPoly[i].contains("x")) {
               if (splitPoly[i].equals("x")) {
                   cnt++;
               } else {
                   cnt += Integer.parseInt(splitPoly[i].replaceAll("x",""));
               }
           } else if (!splitPoly[i].equals("+")) {
               num += Integer.parseInt(splitPoly[i]);
           }
        }
        if (cnt != 0 && num != 0) {
            answer = (cnt == 1 ? "x" : cnt + "x") + " + " + num;
        } else if (cnt != 0) {
            answer = (cnt == 1 ? "x" : cnt + "x");
        } else {
            answer = String.valueOf(num);
        }
        return answer;
    }
}