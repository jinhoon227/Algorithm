package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Baekjoon10814 {

    // 나이순 정렬
    public void solution() {
        Person[] people = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine());
            people = new Person[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                people[i] = new Person(Integer.parseInt(st.nextToken()),
                        st.nextToken());
            }
        } catch (Exception e) {
        }

        Arrays.sort(people);

        StringBuilder sb = new StringBuilder();
        for (Person person : people) {
            sb.append(person.age)
                    .append(" ")
                    .append(person.name)
                    .append(System.getProperty("line.separator"));
        }
        System.out.println(sb);

    }

    private class Person implements Comparable<Person> {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return this.age - o.age;
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10814().solution();
//    }
//}