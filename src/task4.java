import java.util.ArrayList;
import java.util.Scanner;
public class task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite vashu pervuy zadachu:");
        String zadacha = in.nextLine();
        ArrayList <String> ToDo = new ArrayList<>();
        ToDo.add(zadacha);
        System.out.println("Zadacha zapisana!!!\n" +
                "Nazhmite 1 chtobi vvesti eshe odnu zadachu\n" +
                "Nazhmi 2 chtobi vivesti spisok del.\n" +
                "Nazhmite 3 chtobi  udalit' kakuyu-nibud' zadachu.\n" +
                "Dlya zaversheniya raboti najmite 0.");
        int num = in.nextInt();
        while(num != 0) {
            switch (num){
                case (1):
                    System.out.println("Vvedite zadachu: ");
                    Scanner scanner = new Scanner(System.in);
                    String zadacha2 = scanner.nextLine();
                    ToDo.add(zadacha2);
                    System.out.println( "Nazhmite 1 chtobi vvesti eshe odnu zadachu\n" +
                            "Nazhmi 2 chtobi vivesti spisok del.\n" +
                            "Nazhmite 3 chtobi  udalit' kakuyu-nibud' zadachu.\n" +
                            "Dlya zaversheniya raboti najmite 0.");
                    num = in.nextInt();
                    break;
                case (2):
                    System.out.println("Vashi dela");
                    for (int i = 0; i < ToDo.size(); i++) {
                        System.out.println(i + " - " + ToDo.get(i));
                    }
                    System.out.println( "Nazhmite 1 chtobi vvesti eshe odnu zadachu\n" +
                            "Nazhmi 2 chtobi vivesti spisok del.\n" +
                            "Nazhmite 3 chtobi  udalit' kakuyu-nibud' zadachu.\n" +
                            "Dlya zaversheniya raboti najmite 0.");
                    num = in.nextInt();
                    break;
                case (3):
                    System.out.print("Vvedite index zadachi, kotoruy hotite udalit': ");
                    int index = in.nextInt();
                    while (index > ToDo.size()){
                        System.out.println("Vi vveli ne verni index! Poprobuite snova: ");
                        index = in.nextInt();
                    }
                    ToDo.remove(index);
                    System.out.println("Zadacha pod indexom " + index + " udalena iz vashego spiska!");
                    System.out.println( "Nazhmite 1 chtobi vvesti eshe odnu zadachu\n" +
                            "Nazhmi 2 chtobi vivesti spisok del.\n" +
                            "Nazhmite 3 chtobi  udalit' kakuyu-nibud' zadachu.\n" +
                            "Dlya zaversheniya raboti najmite 0.");
                    num = in.nextInt();
                    break;
            }
        }
    }
}
