package 异常;

class DivideByMinusException extends Exception {

    int divisor;

    public DivideByMinusException(String msg, int divisor) {
        super(msg);
        this.divisor = divisor;
    }

    public int getDivisor() {
        return divisor;
    }
}

class Test {

    public int devide(int x, int y) throws DivideByMinusException {
        if (y < 0) {
            throw new DivideByMinusException("除素不能为负！", y);
        }
        //int result = x / y;
        return x / y;
    }
}

public class 自定义异常3 {

    public static void main(String[] args) {
        try {
            //int result = new Test().devide( 3, 0 );
            int result = new Test().devide(3, -1);
            //int result = new Test().devide( 3, 1 );
            System.out.println("the result is " + result);
        } catch (DivideByMinusException e) {
            System.out.println("program is running into" +
                    "DevideByMinusException");
            System.out.println(e.getMessage());
            System.out.println("the devisor is " +
                    e.getDivisor());
            return;
            //System.exit(0);
            //break;
        } catch (ArithmeticException e) {
            System.out.println("program is running into" +
                    " DevideByMinusException");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("program is running into" +
                    "other unknowned Exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ffffff");
        }
        System.out.println("program is running here ,that is normal !");
    }
}
