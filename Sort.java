public class Sort {

   public static void sort(int[] array) {

     if (array.length <= 1)
       return;

     int[] left = new int[array.length / 2];
     int[] right = new int[array.length / 2];

     System.arraycopy(array, 0, left, 0, left.length);
     System.arraycopy(array, array.length / 2, right, 0, right.length);

     sort(left);
     sort(right);

     int left_i = 0;
     int right_i = 0;
     int insert_i = 0;
     while (left_i < left.length && right_i < right.length) {
       if (left[left_i] <= right[right_i]) {
         array[insert_i++] = left[left_i++];
       } else {
         array[insert_i++] = right[right_i++];
       }
     }
     
     for (;left_i < left.length; left_i++) {
       array[insert_i] = left[left_i];
       insert_i++;
     }
     
     for (;right_i < right.length; right_i++) {
       array[insert_i] = right[right_i];
       insert_i++;
     }

   }

}

