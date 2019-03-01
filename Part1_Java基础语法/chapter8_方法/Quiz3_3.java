/**
 * Quiz3_3
 */
public class Quiz3_3 {
    // 求数组元素的平均值
    public float avgArray(float[] array) {
        float avg, sum = 0;
        for(float n : array){
            sum += n;
        }
        avg = sum / array.length;
        return avg;
    }

    public static void main(String[] args) {
        // 定义对象
        Quiz3_3 quiz = new Quiz3_3();
        // 创建float类型的数组并初始化
        float[] array = {78.5f, 98.5f, 65.5f, 32.5f, 75.5f};
        // 调用方法求平均值并打印输出
        System.out.println("数组的平均值为：" + quiz.avgArray(array));
    }
}