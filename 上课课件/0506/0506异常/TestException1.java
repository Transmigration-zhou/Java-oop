public class TestException1 {

    public static void main(String[] args) {
        try {

            //throw new Exception("oppop"); //��ʽ�׳��쳣
            Testt aa = new Testt();
            int reslut = aa.devide(3, 0);  //��ʽ�׳��쳣
            System.out.println("the result is " + reslut);
        } 
        


        catch (Exception e) {
            System.out.println("in catch!!!!");
            System.out.println(e.getMessage());
            return;
            //System.exit(0);
        } 

        finally {
            System.out.println("finally a");
        }
    }
}

class Testt {

    public int devide(int x, int y) {
        //int result = x/y;
        return x / y;
    }
}
