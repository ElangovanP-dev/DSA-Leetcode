error id: file:///C:/Users/elang/OneDrive/Desktop/DSA_LeetCode/Day-68/Pascal'sTriangle.java:java/util/List#add().
file:///C:/Users/elang/OneDrive/Desktop/DSA_LeetCode/Day-68/Pascal'sTriangle.java
empty definition using pc, found symbol in pc: java/util/List#add().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 453
uri: file:///C:/Users/elang/OneDrive/Desktop/DSA_LeetCode/Day-68/Pascal'sTriangle.java
text:
```scala
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal =new ArrayList();
        for(int i=0;i<numRows;i++){
            List <Integer> row =new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prevRow=pascal.get(i-1);
                    row.@@add(prevRow.get(j)+prevRow.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/List#add().