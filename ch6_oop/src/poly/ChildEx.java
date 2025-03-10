package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Child();

        child.method1();
        child.method2();
        child.method3();

        System.out.println();
        // parent 접근 범위가 줄어듬
        parent.method1(); // parent method1()
        parent.method2(); // Child method2()

        // 부모 = 자식 (O)
        Child child2 = (Child) parent;
        child2.method3();

        // java.lang.ClassCastException: class poly.Parent
        // 자식 = 부모 (X)
        Parent parent2 = new Parent();
        child2 = (Child) parent2;
        // child2.method3();

    }
}
