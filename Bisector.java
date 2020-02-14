public class Bisector {
    public static void main(String [] args){
        //The main method inputs the intervals and prints out the zeroes
        System.out.println(calcZero(-1, -0.7));
        System.out.println(calcZero(1.1, 1.3));
        System.out.println(calcZero(1.3, 1.5));
        System.out.println(calcZero(1.65, 1.75));
        System.out.println(calcZero(1.75, 1.85));
        System.out.println(calcZero(1.85, 1.95));
    }


    public static double calcZero(double min, double max){
        double solution;
        while(true){
           solution = calcMid(min, max);
           //Checks if the midpoint calculated is the solution
           if((Math.abs(min-max))< .00001){
               break;
           }
           /*If the value of the function at the midpoint is on a different
            side of the x axis than the value at the minimum interval
            then the midpoint becomes the new minimum end of the interval */
           else if(evaluate(min) * evaluate(solution) >= 0){
               min = solution;
           }
           //otherwise the midpoint becomes the new maximum
           else if(evaluate(max) * evaluate(solution) >= 0){
               max = solution;
           }
        }
        return solution;
    }
    //Caluclates the midpoint by finding the average of the two ends of the interval
    public static double calcMid(double min, double max){
        double mid = (min + max)/2;
        return  mid;
    }
    //Just a complicated way of calculating the value of the function
    public static double evaluate(double x){
        double y = Math.pow(x, 3);
        double z = Math.pow(x, 4);
        return Math.pow(2.02, -y) - y*Math.cos(z)-1.984;
    }
}