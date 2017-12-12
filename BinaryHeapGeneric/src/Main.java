public class Main
{

    public static void main(String[] args) {

        String[] strArray = { "k", "a", "s", "p", "f"};
        Integer[] intArray = { 3, 15, 7, 1, 99, 200, 4, 25, 999, 0, 29 };

        BinaryHeap<Integer> intBh = new BinaryHeap<>(intArray);
        BinaryHeap<String> strBh = new BinaryHeap<>(strArray);


        System.out.println(intBh.length());
        System.out.println(intBh.peek());
        System.out.println(intBh);
        System.out.println(intBh.remove(0));
        System.out.println(intBh);
        System.out.println(intBh.peek());

        while (!intBh.isEmpty()) {
            System.out.println(intBh);
            System.out.println(intBh.remove());

        }
        System.out.println(intBh.length());



        System.out.println(strBh.length());
        System.out.println(strBh.peek());
        System.out.println(strBh);
        System.out.println(strBh.remove("p"));
        System.out.println(strBh);
        System.out.println(strBh.peek());

        while (!strBh.isEmpty()) {
            System.out.println(strBh);
            System.out.println(strBh.remove());

        }
        System.out.println(strBh.length());

    }
}