package chapter_14.section_14_2;

public class RecorderAi {
    public static void main(String[] args) {
        showHeading();
        showBook("旅の記録", 320);
        showBook("星の地図", 180);
    }

    public static void showHeading() {
        System.out.println("読書の記録");
        System.out.println("==========");
    }

    public static void showBook(String title, int pages) {
        System.out.println(title + " は " + pages + " ページ");
    }
}
