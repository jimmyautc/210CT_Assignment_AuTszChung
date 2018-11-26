/*
	course:210ct
	Name:AuTszChung
	Program:QuickSort.java
	Description: Program of  sorting by quick sort
*/
public class QuickSort {

    static int[] element = {30,13,22,90};
    public static void main(String[] args) {
		
        printElement();
        qsort(0, element.length - 1);
    }

    private static void qsort(int left, int right) {

        int pivotIndex = left; //set first element as pivot
        int storeIndex = pivotIndex + 1;

        for (int i = pivotIndex + 1; i <= right; i++)
            if (element[i] < element[pivotIndex]) {
                swap(i, storeIndex);
                storeIndex++;
            }

        swap(pivotIndex, storeIndex - 1);
        printElement();

        //recursion
        if (storeIndex - 2 - left >= 1)
            qsort(left, storeIndex - 2);

        if (right - storeIndex >= 1)
            qsort(storeIndex, right);
    }

    private static void swap(int n1, int n2) {
        int tmp = element[n1];
        element[n1] = element[n2];
        element[n2] = tmp;
    }

    private static void printElement() {
        for (int i = 0; i < element.length; i++)
            System.out.print(element[i] + "  ");
        System.out.println("");
    }
}
