import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] testArray = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxArea(testArray));

        MaxNumberOfKsumPairs maxNumber = new MaxNumberOfKsumPairs();
        int[] testArray={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int number=2;
        System.out.println(maxNumber.maxOperations(testArray,number));

        MaximumAverageSubarray maximumSubarray = new MaximumAverageSubarray();
        int []nums ={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(maximumSubarray.findMaxAverage(nums,k));

        LongestSubarrayOfOnes longestSubarrayOfOnes = new LongestSubarrayOfOnes();
        int[] nums={0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarrayOfOnes.longestSubarray(nums));


        FindHighestAltitude highestAltitude = new FindHighestAltitude();
        int[] nums={-4,-3,-2,-1,4,3,2};
        System.out.println(highestAltitude.largestAltitude(nums));

        FindPivotIndex solution = new FindPivotIndex();
        int[] nums={-1,-1,0,0,-1,-1};
        System.out.println(solution.pivotIndex(nums));

        UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(solution.uniqueOccurrences(nums));

        Solution solution1 = new Solution();
        String s="DDRRR";
        System.out.println("Cevappp --->  " + solution1.predictPartyVictory(s));

        */
        int [] array = {5,4,2,1,3,7};

        ListNode head = new ListNode(5),headStart;
        headStart = head;
        for(int i =1; i< array.length; i++){
            ListNode newNode = new ListNode(array[i]);
            head.next = newNode;
            head = head.next;
        }
        MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();
        System.out.println(solution.pairSum(headStart));

    }
}