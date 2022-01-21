public class main {
    public static void main(String[] args) {
        //shaloow copy
        car car1= new carImpl();
        car car2 = new carImpl();
        car1=car2;
        System.out.println(" car1 " + car1 + "car 2" +car2 );


    }
}
