package Problem;

public class Box {
    double height,width,depth;

    Box(double h,double w, double d){
        height = h;
        width =w;
        depth =d;
    }

    void display(){
        double vol = height*width*depth;
        System.out.println("The volume is :" +vol);
    }
}
