public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
            int Sum = (array.length + 1) * (array.length + 2) / 2;
            for (int i : array) {
                Sum -= i;
            }
            return Sum;
        }
        
    

    public static int secondMaxValue(int [] array) {
            int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
            for (int value : array) {
                if (value > max) {
                    secondMax = max;
                    max = value;
                } else if (value > secondMax && value != max) {
                    secondMax = value;
                }
            }
            return secondMax;
        }
        
    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
         for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]  ) {
                        break;
                    }
                }
            }
            return true;
        }
    public static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] < array[i + 1]) {
            return false;
        }
    }
    return true;
}
    }
        
    


