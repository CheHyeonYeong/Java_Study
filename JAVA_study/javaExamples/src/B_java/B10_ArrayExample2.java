package B_java;

class B10_ArrayExample2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,3,4,5};

        //2차원 배열 : 데이터 타입이 int[]로 구성되어 있는 배열
        int[][] arr2={
            {3,3,3},
            {4,5,6},
            {5,5,5},
            num
        };
        int[][][] arr3 = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        System.out.println();
        for(int i =0; i< arr3.length;i++){
            for(int j =0; j<arr3[i].length;j++){
                for(int k = 0; k<arr3[i][j].length;k++){
                    System.out.print(arr3[i][j][k]+"\t");
                }
                System.out.println();
            }
        }
        

    }
    
}