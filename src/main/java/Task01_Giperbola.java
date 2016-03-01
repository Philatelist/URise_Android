/* 1. Построить программу для работы с классом для хранения данных о кривой второго порядка - гиперболе.
        Программа должна обеспечивать: расчет у по х и наоборот, ввод значений, вывод значений.

        x^2/a^2 - y^2/b^2 = 1;

        */

public class Task01_Giperbola {

    private double pointX;
    private double pointY;
    private double axisA = 5;
    private double axisB = 5;

    public Task01_Giperbola(double axisA, double axisB) {
        this.axisA = axisA;
        this.axisB = axisB;
    }

    public void setAxisA(double axisA) {
        this.axisA = axisA;
    }

    public void setAxisB(double axisB) {
        this.axisB = axisB;
    }

    public void getXfromY(double y) {

        this.pointX = Math.sqrt(Math.pow(axisA, 2) * (1 + (Math.pow(y, 2) / Math.pow(axisB, 2))));

//        print(this.pointX, y);
    }

    public void getYformX (double x) {

        this.pointY = Math.sqrt(Math.pow(axisB, 2) * ((Math.pow(x, 2) / Math.pow(axisA, 2)) - 1));

//        print(x, this.pointY);
    }

    private void print(double x, double y) {
        System.out.println("Axis A = " + axisA + ";\n"
                + "Axis B = " + axisB + ";\n"
                + "Point X = " + x + ";\n"
                + "Point Y = " + y + ";");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task01_Giperbola that = (Task01_Giperbola) o;

        if (Double.compare(that.pointX, pointX) != 0) return false;
        if (Double.compare(that.pointY, pointY) != 0) return false;
        if (Double.compare(that.axisA, axisA) != 0) return false;
        return Double.compare(that.axisB, axisB) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(pointX);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pointY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(axisA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(axisB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Task01_Giperbola{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                ", axisA=" + axisA +
                ", axisB=" + axisB +
                '}';
    }
}