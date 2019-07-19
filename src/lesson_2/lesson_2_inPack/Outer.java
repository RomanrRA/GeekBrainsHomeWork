package lesson_2.lesson_2_inPack;

public class Outer {

    private int outerVar;

    class Inner {
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }

        void innerTest() {
            System.out.println(innerVar);
            System.out.println(outerVar);
        }
    }
//    void outerTest() {
//        System.out.println(innerVar);
//        System.out.println(outerVar);
//    }
}

class OuterAndInner {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner(1);
    }
}