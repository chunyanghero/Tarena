public class StringConnector {
    public static void main(String[] args) {
        int a = 100;
        String msg = "a =" + a;    // a = 100
        System.out.println(msg);

        msg = "" + 100 + 200;
        System.out.println(msg);    // 100200
//        System.out.println(msg == 100200); // Error, can't compare diff types

        msg = 100 + 200 + "";
        System.out.println(msg);    // 300
//        System.out.println(msg == 300);   // Error, can't compare diff types


    }
}

/**
 * a = 100
 *    100200
 *    300
 */
