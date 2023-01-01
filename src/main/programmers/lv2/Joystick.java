package main.programmers.lv2;

public class Joystick {

    // 조이스틱
    public int solution(String name) {
        int answer = 0;
        int widthMove = name.length() - 1;
        for (int index = 0; index < name.length(); index++) {
            char current = name.charAt(index);
            if (current <= 'N') {
                answer += current - 'A';
            } else {
                answer += 'Z' - current + 1;
            }

            int position = index + 1;
            while(position < name.length() && name.charAt(position) == 'A'){
                position++;
            }

            widthMove = Math.min(widthMove, index * 2 + name.length() - position);
            widthMove = Math.min(widthMove, (name.length() - position) * 2 + index);
        }


        return answer + widthMove;
    }
}
