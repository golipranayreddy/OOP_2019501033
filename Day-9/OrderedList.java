/**
 * 
 */

public class OrderedList extends AbstractList {
    /*
     * The add method does what the name suggests.
     * Add an int item to the list.
     * The assumption is to store the item at the end of the list
     * What is the end of the list?
     * Is it the same as the end of the array?
     * Think about how you can use the size variable to add item
     * to the list.
     * 
     * The method returns void (nothing)
     */
    public void add(int item) {
        //Inserts the specified element at the end of the list.
        // TODO
        // Your code goes here....
        if (this.size >= list.length-1){
            resize();
        }
        if (contains(item)) {
            // System.out.println("i'm repeated");
            return;
        }
       
        if (this.size == 0 ) {
            //  System.out.println(" first element");
            list[size] = item;
            size++;
            return;
        }
        int i;
        for ( i= 0; i < size; i++) {
            // System.out.println(" Going to added");
            if (list[i] > item) {
                for (int j = size; j > i; j--) {
                    list[j] = list[j - 1];
                }
                list[i] = item;
                size++;
                // System.out.println("added");
                break;
            }
        }
        if (i == this.size()) {
            // System.out.println("added at last");
            list[size++] = item;
        }
    }

    public int rank(int item) {
        int lo = 0, hi = size-1; 
        while (lo <= hi) { 
            int mid = lo + (hi - lo) / 2;
            if      (item < list[hi]) hi = mid - 1; 
            else if (item > list[lo]) lo = mid + 1; 
            else return mid; 
        } 
        return lo;
    } 

    public static void main(String[] args) {
        AbstractList lst = new OrderedList();
        lst.add(1, 1);
    }
    
}