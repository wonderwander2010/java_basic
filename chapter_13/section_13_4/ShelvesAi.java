package chapter_13.section_13_4;

public class ShelvesAi {
    public static void main(String[] args) {
        int[][] shelf = {
            {320, 180},
            {480, 96, 240}
        };

        System.out.println("棚は " + shelf.length + " つあります");

        for (int i = 0; i < shelf.length; i++) {
            System.out.print((i + 1) + "つ目の棚: ");
            for (int j = 0; j < shelf[i].length; j++) {
                System.out.print(shelf[i][j] + " ページ");
                if (j < shelf[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
