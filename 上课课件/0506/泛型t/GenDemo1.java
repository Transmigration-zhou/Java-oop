
package c0304.泛型t;

class Gen1 {

    private Object ob;     //定义一个通用类型成员

    public Gen1(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("T的实际类型是: " + ob.getClass().getName());
    }
}

public class GenDemo1 {

    public static void main(String[] args) {
                //定义类Gen2的一个Integer版本
        Gen1 intOb = new Gen1(new Integer(88));
        intOb.showType();
        int i = (Integer) intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("----------------------------------");
                // 定义类Gen2的一个String版本
        Gen1 strOb = new Gen1("Hello Gen!");
        strOb.showType();
        String s = (String) strOb.getOb();
        System.out.println("value= " + s);
    }
}
