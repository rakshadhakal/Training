public class ArrayDemo {
    public static void main(String[] args) {
        // declaring array
        int[] a;// declaring
        a = new int[5]; // creation and intialization using keyword
        int[] b = new int[5]; // array declartaion,creation and initialization
        // once created array elements are assigned a default value of that type
        // int c[]= new int[5];
        // arrays are of fixed size, i.e. the cannot be resized
        // accessing aaray element
        // we have to use position value/index to individually access
        // array elements , index starts from 0 upto length-1
        a[0] = 12; // assign 12 as a a first element
        a[4] = 24; // assign 21 as a last element in an aaray of size 5
        System.out.println("First element:" + a[0]);
        System.out.println("Third element:" + a[2]);
        System.out.println("last element:" + a[4]);
        System.out.println("Size of aaray:" + a.length); // no of element in array

        a[1] = a[0] + a[2]; // we can use aaray elements in any form of expression
        // we can access all array elements using for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        } // we can use this loop to read and write on array element
          // using enhanced for-loop to access array elements
        for (int e : a) {
            System.out.println(e);
        } // this also access all array element from start to end without
          // using index , but we cannot use this to write on array elements
          // primitive array elements

    }

}
