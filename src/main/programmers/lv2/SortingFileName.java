package main.programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class SortingFileName {

    // 파일명 정렬
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = o1.split("[0-9]+")[0].toLowerCase();
                String head2 = o2.split("[0-9]+")[0].toLowerCase();
                int firstCompare = head1.compareTo(head2);
                if (firstCompare != 0) {
                    return firstCompare;
                }

                int number1 = Integer.parseInt(o1.split("\\D+")[1]);
                int number2 = Integer.parseInt(o2.split("\\D+")[1]);
                if (number1 != number2) {
                    return number1 - number2;
                }

                return 0;
            }
        });

        return files;
    }
}
