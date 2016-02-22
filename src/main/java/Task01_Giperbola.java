/* 1. Построить программу для работы с классом для хранения данных о кривой второго порядка - гиперболе.
        Программа должна обеспечивать: расчет у по х и наоборот, ввод значений, вывод значений.
        */

public class Task01_Giperbola {

    double pointX;
    double pointY;
    double axisA = 5;
    double axisB = 5;

    public void setAxisA(double axisA) {
        this.axisA = axisA;
    }

    public void setAxisB(double axisB) {
        this.axisB = axisB;
    }

    public void getXfromY(double y) {

        this.pointX = Math.sqrt(Math.pow(axisA, 2) * (1 + (Math.pow(y, 2) / Math.pow(axisB, 2))));

        System.out.println("Axis A = " + this.axisA + ";\n"
                + "Axis B = " + axisB + ";\n"
                + "Point X = " + this.pointX + ";\n"
                + "Point Y = " + y + ";");
    }

    public void getYformX (double x) {

        this.pointY = Math.sqrt(Math.pow(axisB, 2) * ((Math.pow(x, 2) / Math.pow(axisA, 2)) - 1));

        System.out.println("Axis A = " + this.axisA + ";\n"
                + "Axis B = " + axisB + ";\n"
                + "Point X = " + x + ";\n"
                + "Point Y = " + this.pointY + ";");
    }

    public static void main(String[] args) {
        Task01_Giperbola test = new Task01_Giperbola();
        test.getXfromY(4.3);
        test.getYformX(5.4);
    }
}