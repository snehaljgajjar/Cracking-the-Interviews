import java.util.HashMap;

/**
 * Created by Snehal on 2/10/2017.
 *
 *
 * Question: Given two sorted arrays, find the number of elements in common. The arrays are the same length
 and each has all distinct elements.
 Let's start with a good example. We'll underline the elements in common.
 A: 13 27 35 40 49 55 59
 B: 17 35 39 40 55 58 60

 The BCR is O ( N),
 */
public class FindCommonArrayElements {
    public static void main(String[] args){
        int[] A = {13, 27 ,35, 40, 49, 55, 59 };
        int[] B = {17, 35, 39, 40, 55, 58, 60 };
        findCommanElementWithHash(A,B);
        System.out.println();
        System.out.println();
        findCommanElementWithLoop(A,B);
    }

    private static void findCommanElementWithLoop(int[] a, int[] b) {
        int j = 0;
        for(int i = 0 ; i< a.length ; ){
            if(a[i] == b[j]){
                System.out.println("Comman Element is : " + a[i]);
                j++;
            }else if(a[i] > b[j]){
                j++;
            }else if(a[i] < b[j]){
                i++;
            }

        }

    }

    private static void findCommanElementWithHash(int[] a, int[] b) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int element : a){
            if(hm.containsKey(element)){
                int temp = hm.get(element) + 1;
                hm.put(element,temp);
            }
            hm.put(element,0);
        }

        for(int elementOfB : b){
            if(hm.containsKey(elementOfB)){
                System.out.println("Comman Element is : " + elementOfB);
            }
        }
    }
}
