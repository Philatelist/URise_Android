public class Task01_test {
    public static void main(String[] args) {

        Task01_Giperbola test1 = new Task01_Giperbola(5, 5);
        Task01_Giperbola test2 = new Task01_Giperbola(5, 5);
        Task01_Giperbola test3 = test2;

        test1.getXfromY(4.3);
        test1.getYformX(5.4);

        test2.getXfromY(4.3);
        test2.getYformX(5.4);

        test3.getXfromY(5.3);
        test3.getYformX(5.4);


        System.out.println("");
        System.out.println("test1 toString = " + test1.toString());
        System.out.println("test2 toString = " + test2.toString());
        System.out.println("test3 toString = " + test3.toString());
        System.out.println("");
        System.out.println("test1.equals(test2) = " + test1.equals(test2));
        System.out.println("test2.equals(test3) = " + test2.equals(test3));
        System.out.println("");
        System.out.println("test1 hashCode = " + test1.hashCode());
        System.out.println("test2 hashCode = " + test2.hashCode());
        System.out.println("test3 hashCode = " + test3.hashCode());
    }
}
