package main.programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChatting {

    // 오픈 채팅방
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<ArrayList<String>> logs = new ArrayList<>();
        Map<String, String> names = new HashMap<>();
        Map<String, String> commands = Map.of(
                "Enter", "님이 들어왔습니다.",
                "Leave", "님이 나갔습니다."
        );

        for (String line : record) {
            String[] userInfo = line.split(" ");
            if (!userInfo[0].equals("Leave")) {
                names.put(userInfo[1], userInfo[2]);
            }
            if (!userInfo[0].equals("Change")) {
                logs.add(new ArrayList<>(Arrays.asList(userInfo[1], userInfo[0])));
            }
        }

        answer = new String[logs.size()];
        int count = 0;
        for (ArrayList<String> log : logs) {
            answer[count++] = names.get(log.get(0)) + commands.get(log.get(1));
        }

        return answer;
    }
}
