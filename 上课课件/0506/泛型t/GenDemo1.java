
package c0304.����t;

class Gen1 {

    private Object ob;     //����һ��ͨ�����ͳ�Ա

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
        System.out.println("T��ʵ��������: " + ob.getClass().getName());
    }
}

public class GenDemo1 {

    public static void main(String[] args) {
                //������Gen2��һ��Integer�汾
        Gen1 intOb = new Gen1(new Integer(88));
        intOb.showType();
        int i = (Integer) intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("----------------------------------");
                // ������Gen2��һ��String�汾
        Gen1 strOb = new Gen1("Hello Gen!");
        strOb.showType();
        String s = (String) strOb.getOb();
        System.out.println("value= " + s);
    }
}
