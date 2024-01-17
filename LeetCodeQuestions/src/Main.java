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
        ///

        //[3,11,20,null,null,19,33]
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(11);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(19);
        TreeNode treeNode4 = new TreeNode(33);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

//[2,11,26,null,null,19,33]
        TreeNode tree = new TreeNode(2);
        TreeNode tree1 = new TreeNode(11);
        TreeNode tree2 = new TreeNode(26);
        TreeNode tree3 = new TreeNode(19);
        TreeNode tree4 = new TreeNode(33);
        tree.left = tree1;
        tree.right = tree2;
        tree2.left = tree3;
        tree2.right = tree4;
        System.out.println(treeNode.leafSimilar(treeNode,tree));

*/
        //root =[3,1,4,3,null,1,5]
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2= new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode.left = treeNode1;
        treeNode1.left = treeNode3;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        CountGoodNodesinBinaryTree goodNodes = new CountGoodNodesinBinaryTree();
        System.out.println(goodNodes.findGoodNodes(treeNode.val,treeNode));
    }
}