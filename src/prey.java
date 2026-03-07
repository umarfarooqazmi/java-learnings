//interface prey {
//    void run();
//}
//interface predator {
//    void hunt();
//}
//class rabbit implements prey {
//    @Override
//    public void run() {
//        System.out.println("Rabbit is running");
//    }
//}
//class hawk implements predator {
//    @Override
//    public void hunt() {
//        System.out.println("Hawk is Hunting ");
//
//    }
//}
//class fish implements predator,prey {
//    @Override
//    public void hunt() {
//        System.out.println("Fish is Hunting ");
//    }
//    @Override
//    public void run() {
//        System.out.println("Fish is running");
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        rabbit r = new rabbit();
//        hawk h = new hawk();
//        fish f = new fish();
//        r.run();
//        h.hunt();
//        f.hunt();
//        f.run();
//    }
//}
