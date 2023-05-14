package Level8;

public class HeroinCastle {
    public static boolean hero(int bullets, int dragons) {
        int win = dragons*2;
        return bullets >= win;
    }

    public static void main(String[] args) {
        System.out.println(hero(10,5));
    }
}
