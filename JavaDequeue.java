import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int lastUniqueCountMissing;
        HashSet<Integer> dequeUnique = new HashSet<>();

        int resultNum = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        for (int i = 0; 0< deque.size()-m+1; i++) {
            Iterator<Integer> iteratorFirstNum = deque.iterator();
            for (int j = 0; j < m; j++) {
                if (iteratorFirstNum.hasNext()) {
                    dequeUnique.add(iteratorFirstNum.next());
                    if(resultNum >= dequeUnique.size()+m-j-1)
                    break;
                    
                } else {
                    break;
                }
            }

            if (dequeUnique.size() > resultNum) {
                resultNum = dequeUnique.size();              
            } else if (dequeUnique.size() >= m) {
                resultNum = m;
                System.out.println(resultNum);
                return;
            }
            else {
                lastUniqueCountMissing =resultNum-dequeUnique.size();                
                   for(int k=1;k<lastUniqueCountMissing;k++) {
                         deque.removeFirst();
                   }
            }
            dequeUnique.clear();
         
            deque.removeFirst();
        }

        System.out.println(resultNum);
    }
}