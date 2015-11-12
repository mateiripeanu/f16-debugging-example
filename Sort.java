public class Sort {

   public static void sort(int[] array) {

     if (array.length <= 1)
       return;

     int[] left = new int[array.length/2];
     int rightLength = array.length / 2;
     if (array.length % 2 == 1)
       rightLength += 1;
     int[] right = new int[rightLength];

     System.arraycopy(array, 0, left, 0, array.length / 2);
     System.arraycopy(array, array.length / 2, right, 0, rightLength);

     sort(left);
     sort(right);

     int left_i = 0;
     int right_i = 0;
     int insert_i = 0;
     for (; left_i < left.length; left_i++) {
       if (right_i == rightLength || left[left_i] <= right[right_i]) {
         array[insert_i] = left[left_i];
         insert_i += 1;
       } else {
         array[insert_i] = right[right_i];
         insert_i += 1;
         right_i += 1;
         left_i -= 1;
       }
     }
     for (;right_i < right.length; right_i++) {
       array[insert_i] = right[right_i];
       insert_i++;
     }

   }

}
