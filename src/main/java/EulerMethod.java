import java.util.function.Function;

public class EulerMethod {
// dy/dt = y(1-y²)

  //  Function<Double, Double> df = (Double y) ->
  //          y * (1 - Math.pow(y, 2));

    double func(double x, double y){
        return (x = y*(1-Math.pow(y, 2)));
    }

    // Function for Euler formula
    void euler(double x0, double y, double h, double x)
    {
        double y1 = 0;

        while (x0 < x) {

            y1 = y + h * func(x0, y);
            x0 = x0 + h;
        }

        System.out.println("x = "
                + x + " y: " + y1);
    }

    public static void main(String[] args) {
        EulerMethod obj = new EulerMethod();
        double x0 = 0;
        double y0 = 1;
        double h = 0.025;
        double x = 0.1;

        obj.euler(x0, y0, h, x);

    }

}
