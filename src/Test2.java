public class Test2 {
    public static void main(String[] args) {
        System.out.print("Loading ");
        for (int i = 0; i < 60; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("*");

            if (new Test() instanceof Test){
                System.out.println();


            }
            System.out.print("\033[H\033[J");
        }
    }
}
