package test5_16;

/**
 * 使用 A 这个泛型类
 * @author Q
 * @create 2020-05-16-9:56
 */
class A<T> {
    T value;

    A(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }
}
public class TestA {
    public static void main(String[] args) {
        A<Integer> a=new A<Integer>(3);
        System.out.println(a.get());
    }
}