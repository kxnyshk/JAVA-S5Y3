public class AreaOverloading {
    
    static{
    
        System.out.println("Using Method overloading for calculating areas.\n");
    }
    public static void main(String[] args){
    
        methodOverloading ob = new methodOverloading();
        ob.triangle(12, 34);
        ob.circle(7.8);
        ob.rectangle(10, 20);
    }
}

class methodOverloading{

    void triangle(int h, int b){
        int area = (h*b)/2;
        System.out.println("Area of triangle: " + area + " unit sqr.\n");
    }

    void circle(double radi){
        Double area = ((Math.PI)*(Math.pow(radi, 2)));
        System.out.println("Area of circle: " + String.format("%.2f",area) + " unit sqr.\n");
    }

    void rectangle(int l, int b){
        int area = (l*b);
        System.out.println("Area of rectangle: " + area + " unit sqr.\n");
    }
}