/**
 * 
 */
/**
 * @author T30689
 *
 */
package DataStructures.Heap;

import java.util.Scanner;

//Sample input
/*
5  
1 4  
1 9  
3  
2 4  
3  
*/

public class QHEap{
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        heap heap = new heap();
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0 ; i < n ; i++){
            int comm = s.nextInt();
            if(comm == 1){
                int add = s.nextInt();
                heap.add(add);
            }else if(comm == 2){
                int remove = s.nextInt();
                heap.remove(remove);
            }else{
                System.out.println(heap.container[0]);
            }
        }
    }
    //      0
    //   1     2
    //  3 4   5 6
    static class heap{
        int[] container;
        int count = 0;
        heap(){
            container = new int[1];
        }
        void add(int i){
            container[count++] = i;
            if(count == container.length){
                grow();
            }
            ascend(count - 1);
        }
        void ascend(int pos){
            if(pos == 0 || pos >= count){
                return;
            }
            int parent = (pos - 1) >> 1 ;
            if(container[pos] < container[parent]){
                int temp = container[pos];
                container[pos] = container[parent];
                container[parent] = temp;
            }
            ascend(parent);
        }
        void remove(int i){
            int at = find(i , 0);
            count--;
            container[at] = container[count];
            ascend(at);
            while(true){
                int left = at * 2 + 1;
                int right = at * 2 + 2;
                if(right < count ){
                    int min = container[at];
                    int a = 0;
                    if(container[left] < min){
                        min = container[left];
                        a = 1;
                    }
                    if(container[right] < min){
                        a = 2;
                    }
                    if(a == 0){
                        break;
                    }else if(a == 1){
                        int temp = container[at];
                        container[at] = container[left];
                        container[left] = temp;
                        at = left;
                    }else {
                        int temp = container[at];
                        container[at] = container[right];
                        container[right] = temp;
                        at = right;
                    }
                }else{
                    if(left < count && container[at] > container[left]){
                        int temp = container[at];
                        container[at] = container[left];
                        container[left] = temp;
                    }
                    break;
                }
            }
        }
        int find(int i,int pos){
            if(pos >= count){
                return -1;
            }
            if(container[pos] == i){
                return pos;
            }
            int left = find(i , pos * 2 + 1) ;
            if(left > 0){
                return left;
            }
            int right = find(i , pos * 2 + 2) ;
            if(right > 0){
                return right;
            }
            return -1 ;
        }
        void grow(){
            int[] con2 = new int[container.length * 2];
            System.arraycopy(container , 0 , con2 , 0 ,container.length);
            container = con2;
        }
        public String toString(){
            String re = "";
            for(int i = 0 ; i < count ; i++){
                re += container[i] + " ";
            }
            return re;// "" + container[0];
        }
    }
	
}