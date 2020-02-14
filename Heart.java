public class Heart {
    //The main method runs the code and prints out the final area. The radius of the circle was determined using Desmos
    public static void main(String[] args){
        System.out.println(2*trapezoid(0,1.414)- circle(Math.sqrt(1.077)));
    }
     //This is the equation of the top part of the heart. It is also moved down to the x axis.
    public static double top(double x){
        double num = (Math.sqrt(2-Math.pow(x, 2))+ Math.sqrt(Math.abs(x))-1.2);
        return num;
    }
       //This is the equation of the bottom part of the heart. It is also flipped over and moved up to the x axis
     public static double bottom(double x){
         double num = (Math.sqrt(2-Math.pow(x, 2))- Math.sqrt(Math.abs(x))+1.19);
         return num;
     }
      /*
        Implements the trapezoid rule
        I made the interval small so that the value could be as accurate as possible
       */
    public static double trapezoid(double min, double max)  {
             double sum = 0;
             double f = 0;
        for(double p = .00000001; p <= max; p = p + .00000001) {
               sum += ( .00000001)  * .5 *(top(p) + top(f));
               sum += (.00000001)  * .5 *(bottom(p) + bottom(f));
               f = p;
           }
        return sum;
    }
       //Calculates the area of the circle
    public static double circle(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}