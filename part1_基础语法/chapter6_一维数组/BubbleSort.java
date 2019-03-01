package part1_基础语法.chapter6_一维数组;

public class BubbleSort{
    public static void main(String[] args){
        int[] sort = {34, 53, 12, 32, 56, 17};
        int temp;
        for(int i = 0; i < sort.length - 1; i++){
            for(int j = 0; j < sort.length - 1 - i; j++){
                if(sort[j] > sort[j + 1]){
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        for(int n : sort){
            System.out.print(n + "  ");
        }
    }
}
