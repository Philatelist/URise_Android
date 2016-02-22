/* 2. Построить программу для работы с классом для хранения данных о кривой второго порядка - эллипсе.
        Программа должна обеспечивать простейшие функции: расчет у по х и наоборот, ввод значений, вывод значений.

        x^2/a^2 + y^2/b^2 = 1;
        */

public class Task02_Ellipse {

    private double pointX;
    private double pointY;
    private double bigHalfAxisA = 13;
    private double smallHalfAxisB = 7;

    public double getBigHalfAxisA() {
        return bigHalfAxisA;
    }

    public void setBigHalfAxisA(double bigHalfAxisA) {
        this.bigHalfAxisA = bigHalfAxisA;
    }

    public double getSmallHalfAxisB() {
        return smallHalfAxisB;
    }

    public void setSmallHalfAxisB(double smallHalfAxisB) {
        this.smallHalfAxisB = smallHalfAxisB;
    }

    public void getXfromY(double y) {
        this.pointX = Math.sqrt(Math.pow(bigHalfAxisA, 2) * (1 - Math.pow(y, 2) / Math.pow(smallHalfAxisB, 2)));
        System.out.println("Big axis = " + bigHalfAxisA * 2 + ";\n"
                + "Small axis = " + smallHalfAxisB * 2 + ";\n"
                + "Point X = " + pointX + ";\n"
                + "Point Y = " + y + ";");
    }

    public void getYfromX(double x) {
        this.pointY = Math.sqrt(Math.pow(smallHalfAxisB, 2) * (1 - Math.pow(x, 2) / Math.pow(bigHalfAxisA, 2)));
        System.out.println("Big axis = " + bigHalfAxisA * 2 + ";\n"
                + "Small axis = " + smallHalfAxisB * 2 + ";\n"
                + "Point X = " + x + ";\n"
                + "Point Y = " + pointY + ";");
    }

    public static void main(String[] args) {
        Task02_Ellipse test = new Task02_Ellipse();
        System.out.println(test.getBigHalfAxisA());
        System.out.println(test.getSmallHalfAxisB());

        test.getXfromY(5);
        test.getYfromX(11);
    }
}
