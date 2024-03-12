package week01;

public class B_QuizArray2 {
    //총합과 값
    static int[][] numArr ={
        {5,5,5},
        {10,10,10,10,10},
        {20,20,20},
        {30,30,30}};

    static void one(){
        int sum =0;
        int count=0;
        for (int i =0; i<numArr.length;i++){
            for (int j = 0; j<numArr[i].length;j++){
                sum+=numArr[i][j];
                count+=1;
            }
        }
        System.err.println("total : "+sum+"\nave : "+sum/count);
    }
    //짝수번째만
    
    static void two(){
        int sum =0;
        int count=0;
        for (int i =0; i<numArr.length;i=i+2){
            for (int j = 0; j<numArr[i].length;j++){
                sum+=numArr[i][j];
                count+=1;
            }
        }
        System.err.println("total : "+sum+"\nave : "+sum/count);
    }
    public static void main(String[] args) {
        one();
        two();
    }
    
}
