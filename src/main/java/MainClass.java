public class MainClass {

    public MainClass(){

    }
    //inside main class
    public int circle_area(int r){
        double c_area = r * r * 3.14;
        return (int) c_area;
    }
    //varma
    public int rectangle_area(int h, int l){
        double r_area = h * l;
        return (int) r_area;
    }

    public int triangle_area(int h, int b){
        double t_area = (h * b)/2;
        return (int) t_area;
    }

}

