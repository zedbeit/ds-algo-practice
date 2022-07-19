package monotonic_array;

public class MonotonicArray {
    // O(n) Time complexity
    // O(1) Space complexity
    public static void main(String[] args) {
        
        var array = new int[] {-3,-5,-15,-500,-500,-700,-703,-1001};
        
        boolean monotonic = isMonotonic(array);

        System.out.println(monotonic);
    }

    public static boolean isMonotonic(int[] array) {
  
      if(array.length == 0 || array.length == 1){
        return true;
      }
      
      boolean increasing = isIncreasing(array);
      
      if(increasing){
  
        for(int i=1; i < array.length; i++){
  
          if(array[i] < array[i-1]){
            return false;
          }
          
        } 
        
        return true;
      
      } 
      else {
        
        for(int i=1; i < array.length; i++){
  
          if(array[i] > array[i-1]){
            return false;
          }
          
        }
      }
      
      return true;
    }
  
    public static boolean isIncreasing(int[] array){
  
      for(int i=1;i<array.length;i++){
        
        if(array[i] == array[i-1]){
          continue;
        }
        if(array[i] > array[i-1]){
          return true;
        }
        
      }
      return false;
    } 
    
    
}
  