public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Talkative talkactive =new Talkative(i);
            Talkative talkative = new Talkative(i);
            Thread thread = new Thread(talkative);
            thread.start();
        }
    }
}
// nous constatons que les valeurs affichées par chaque thread sont mélangées et ne sont pas affichées dans l'ordre.