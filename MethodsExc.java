public class MethodsExc {
    
  static float  add (float x , float y , float z) {
    return  x + y + z ;
  }

  static float sub (float x , float y , float z) {
    return  x - y - z ;
  }

    
  static float mult (float x , float y ) {
    return  x * y  ;
  }
   
   
  static float div (float x , float y ) {
    return  x / y  ;
  }

   

  public static void main(String[] args) {
        System.out.print(add(1f,2f,4f));
        System.out.print(sub(4f,3f,2f));
        System.out.print(mult(5f,10f));
        System.out.print(div(5f,4f));
       
 
  }
}
