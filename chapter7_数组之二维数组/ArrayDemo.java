/**
 * ArrayDemo
 */
public class ArrayDemo {

    public static void main(String[] args) {
        //二维数组的三种声明形式
        int[][] intArray;
        float floatArray[][];
        double[] doubleArray[];
        //创建四行两列的数组
        intArray = new int[4][2];
        
        //二维数组声明时可以只但必须指定行数而不指定列数
        floatArray = new float[3][];
        //指定列数的方法
        floatArray[0] = new float[2];
        floatArray[1] = new float[4];

        //二维数组的初始化
        char[][] charArray = {{'a', 'b', 'c', 'd'}, {'1', '2'}};
        System.out.println("数组的行数为：" + charArray.length);
        System.out.println("数组第一行的列数为：" + charArray[0].length);

        //循环输出二维数组的内容
        System.out.println("================================");
        for(int i = 0; i < charArray.length; i++){
            for(int j = 0; j < charArray[i].length; j++){
                System.out.print(charArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}