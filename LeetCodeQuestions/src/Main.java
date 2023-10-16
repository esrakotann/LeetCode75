public class Main {
    public static void main(String[] args) {
/*
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] testArray = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxArea(testArray));
*/
        MaxNumberOfKsumPairs maxNumber = new MaxNumberOfKsumPairs();
        int[] testArray={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int number=2;
        System.out.println(maxNumber.maxOperations(testArray,number));
    }
}