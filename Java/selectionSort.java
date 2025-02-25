1    public static void selectionSort(double[] list) {
  2      for (int i = 0; i < list.length - 1; i++) {
  3        // Find the minimum in the list[i..list.length-1]
  4        double currentMin = list[i];
  5        int currentMinIndex = i;
  6  
  7        for (int j = i + 1; j < list.length; j++) {
  8          if (currentMin > list[j]) {
  9            currentMin = list[j];
 10            currentMinIndex = j;
 11          }
 12        }
 13  
 14        // Swap list[i] with list[currentMinIndex] if necessary;
 15        if (currentMinIndex != i) {
 16          list[currentMinIndex] = list[i];
 17          list[i] = currentMin;
 18        }
 19      }
 20    }