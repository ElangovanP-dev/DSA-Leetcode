error id: file:///C:/Users/elang/OneDrive/Desktop/DSA_LeetCode/Day-66/ArrayPartition.java:
file:///C:/Users/elang/OneDrive/Desktop/DSA_LeetCode/Day-66/ArrayPartition.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 262
uri: file:///C:/Users/elang/OneDrive/Desktop/DSA_LeetCode/Day-66/ArrayPartition.java
text:
```scala
import java.util.Arrays;

class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = nums.length - 2; i >= 0; i -= 2) {
            res += nums[i];
        }
        return res;
    }
}

@@git add .
git commit -m "Day-66 [561. Array Partition]"
git push


```


#### Short summary: 

empty definition using pc, found symbol in pc: 