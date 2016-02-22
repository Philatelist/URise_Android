/* 3. Построить программу для работы с  классом для хранения данных о кривой второго порядка - параболе.
        Программа должна обеспечивать простейшие функции: расчет у по х и наоборот, ввод значений, вывод значений.

        y^2 = 2px;
        */

public class Task03_Parabola {

    private double pointX;
    private double pointY;
    private double vertexP = 3;

    public double getVertexP() {
        return vertexP;
    }

    public void setVertexP(double vertexP) {
        this.vertexP = vertexP;
    }

    public void getXfromY (double y) {
        this.pointX = Math.pow(y, 2) / (2 * vertexP);
        System.out.println("Vertex = " + vertexP + ";\n"
                + "Point X = " + pointX + ";\n"
                + "Point Y = " + y + ";");
    }

    public void getYfromX (double x) {
        this.pointY = Math.sqrt(2 * vertexP * x);
        System.out.println("Vertex = " + vertexP + ";\n"
                + "Point X = " + x + ";\n"
                + "Point Y = " + pointY + ";");
    }

    public static void main(String[] args) {
        Task03_Parabola test = new Task03_Parabola();
        System.out.println(test.getVertexP());
        test.setVertexP(4);
        test.getXfromY(15);
        test.getYfromX(7);
    }
}
