package csc223.mb;

public class FUber {
     public static float euclidean(float x1, float y1, float x2, float y2) {
        
       
        float distance1 = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 -y1, 2));
        
      
        return distance1;

     }

     public static float manhattan(float x1, float y1, float x2, float y2) {
        // Implement the method here
        float d = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        return d;


     }
     public static void main(String[] args){
        System.out.println(FUber.manhattan( 4, 5, 9,3 ));
    } 
 }


