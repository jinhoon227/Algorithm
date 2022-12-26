package main.programmers.lv2;

public class StringCompression {

    // 문자열 압축
    public int solution(String s) {
        int answer = s.length();
        int currentCount;

        for(int index = 1; index <= (s.length() / 2) ; index++){
            currentCount = compressString(s, index);
            answer = Math.min(currentCount, answer);
        }

        return answer;
    }

    private int compressString(String string, int mode) {

        StringBuilder statement = new StringBuilder(string);
        StringBuilder encryptedText = new StringBuilder();

        int count = 1;

        String baseString = statement.substring(0, mode);
        String nextCompressingString;

        for(int start = mode; start <= statement.length(); start+=mode) {

            int end = Math.min(start + mode, statement.length());
            nextCompressingString = statement.substring(start, end);

            if(baseString.equals(nextCompressingString)) {
                count++;
            } else {
                if (count >= 2) {
                    encryptedText.append(count);
                }
                encryptedText.append(baseString);
                baseString = nextCompressingString;
                count = 1;
            }
        }
        encryptedText.append(baseString);
        return  encryptedText.length();
    }
}
