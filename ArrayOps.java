public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt(int[] array) {
    int n = array.length + 1;
    int totalSum = n * (n - 1) / 2;
    for (int num : array) {
        totalSum -= num;
    }
    return totalSum;
}

        
    

   public static int secondMaxValue(int[] array) {
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

        
    

  public static boolean containsTheSameElements(int[] array1, int[] array2) {
    if (array1.length != array2.length) return false;

    boolean[] matched = new boolean[array2.length];
    for (int i = 0; i < array1.length; i++) {
        boolean found = false;
        for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j] && !matched[j]) {
                matched[j] = true; // Mark as matched
                found = true;
                break;
            }
        }
        if (!found) return false;
    }
    return true;
}

       
   public static boolean isSorted(int[] array) {
    boolean isAscending = true, isDescending = true;
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
            isAscending = false;
        }
        if (array[i] < array[i + 1]) {
            isDescending = false;
        }
    }
    return isAscending || isDescending;
}


    }
        
    


