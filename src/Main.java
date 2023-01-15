//overloading paractice
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1;  i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += 1;
                sum += i;
                System.out.println(i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
//    public static int calculate (String playerName, int score) {
//        System.out.println("player " + playerName + " score " + score);
//        return score * 1000;
//    }

}