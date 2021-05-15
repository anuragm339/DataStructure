package arrays;

import java.util.List;
import java.util.PriorityQueue;

public class FindKthLargestElement {
    public static int findKthLargest(List<Integer> ints, int k)
    {
        // create a min-heap using the `PriorityQueue` class and insert
        // the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));

        // do for remaining array elements
        for (int i = k; i < ints.size(); i++)
        {
            // if the current element is more than the root of the heap
            if (ints.get(i) > pq.peek())
            {
                // replace root with the current element
                pq.poll();
                System.out.println(pq.size());
                pq.add(ints.get(i));
            }
        }

        // return the root of min-heap
        return pq.peek();
    }
}
