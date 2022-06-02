package com.company.boostcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1946_neeEmployee {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            ArrayList<Rank> ranking = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ranking.add(new Rank(scanner.nextInt(), scanner.nextInt()));
            }

            // 내림차순 정렬
            ranking.sort((o1, o2) -> o2.resume - o1.resume);

            int newbie = 0;
            for (int i = 0; i < N; i++) {
                boolean pass = false;
                Rank a = ranking.get(i);

                for (int j = i + 1; j < N; j++) {
                    Rank b = ranking.get(j);

                    // 만약 인터뷰 성적 순위가 높다면 합격
                    if (a.interview < b.interview) {
                        pass = true;
                        break;
                    }
                }

                if (pass) newbie++;
            }

            System.out.println(newbie);
        }
    }

    public class Rank {
        public int resume;
        public int interview;

        public Rank(int resume, int interview) {
            this.resume = resume;
            this.interview = interview;
        }
    }
}
