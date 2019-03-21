package part3_Java常用工具类.chapter21_泛型;

public class TwoArgsGeneric<T, X> {
    private T m;
    private X n;

    public TwoArgsGeneric(T m, X n) {
        this.setM(m);
        this.setN(n);
    }

    public T getM() {
        return m;
    }

    public void setM(T m) {
        this.m = m;
    }

    public X getN() {
        return n;
    }

    public void setN(X n) {
        this.n = n;
    }

    public static void main(String[] args) {
        TwoArgsGeneric<Integer, Double> twoArgsGeneric = new TwoArgsGeneric<>(12, 4.5);
        System.out.println("m = " + twoArgsGeneric.getM());
        System.out.println("n = " + twoArgsGeneric.getN());
    }
}
