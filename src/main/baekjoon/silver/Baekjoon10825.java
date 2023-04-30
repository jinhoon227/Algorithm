package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Baekjoon10825 {

    // 국영수
    public void solution() {
        int N = 0;
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                students.add(new Student(st.nextToken(),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken())));
            }

        } catch (Exception e) {

        }

        Collections.sort(students);
        StringBuilder sb = new StringBuilder();
        students.forEach(s -> sb.append(s.name).append(System.getProperty("line.separator")));
        System.out.println(sb);
    }
}
class Student implements Comparable<Student> {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student o2) {
        if (korean != o2.korean) {
            return o2.korean - korean;
        }

        if (english != o2.english) {
            return english - o2.english;
        }

        if (math != o2.math) {
            return o2.math - math;
        }

        return name.compareTo(o2.name);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10825().solution();
//    }
//}