public class Test3 {

    public static void main(String[] args) {
        int[] A = {5,2,4,6,3,7};
//        int[] A = {1,22};
//        int[] A = {0,0};
//        int[] A = {99,99};
//        int[] A = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 99};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {

        int minVal = A[1];
        int minCost=Integer.MAX_VALUE;
        int minCostHere = minCost;
        for (int i=1; i < A.length-2; i++){
            minVal =Math.min(minVal,A[i]);
            minCostHere = Math.min(minCostHere , A[i+2] + minVal);
            minCost = Math.min(minCost , minCostHere);
        }
        return minCost;
//        Integer cost = A[1]+A[3];
//
//
//        for (int i = 1; i < A.length - 1; i++) {
//            for (int j = 2; j < A.length - 1; j++) {
//                if (i + j <= A.length - 1) {
//                   if (cost>A[i] + A[i + j])
//                       cost=A[i] + A[i + j];
//                }
//            }
//
//        }
//
//        return cost;

//        int minVal = A[1];
//        int minCost=Integer.MAX_VALUE;
//        int minCostHere = minCost;
//        for (int i=1; i < A.length-3; i++){
//            minCostHere = Math.min(minCostHere , A[i+2] + minVal);
//            minVal =Math.min(minVal,A[i]);
//            minCost = Math.min(minCost , minCostHere);
//        }
//        return minCost;
    }
}
