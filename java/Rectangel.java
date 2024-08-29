public class Rectangel{
    double width;
    double height;
    void setArea(){
        System.out.println("Area of Rectangle: "+width*height);
    }
   void getArea(double w,double h)
    {
        width = w;
        height = h;
    }
}
class Traiangle extends Rectangel{
    
    void Showtrai(){
        System.out.println("Area of Traiangel: "+width*height*0.5);
    }
 public static void main(String[] args) {
    Rectangel rec = new Rectangel();
    Traiangle tra = new Traiangle();
    rec.getArea(5, 10);
    tra.getArea(10, 5);
    rec.setArea();
    tra.Showtrai();
 }
    
}