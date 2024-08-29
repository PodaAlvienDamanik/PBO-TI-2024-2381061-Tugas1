public class KonversiNumber {
    public static void main(String[] args) {
        //Widening
        byte tipedatabyte = 10;
        short tipedatashort = tipedatabyte;
        int tipedataint = tipedatashort;
        long tipedatalong = tipedataint;
        float tipedatafloat = tipedatalong;
        double tipedatadouble = tipedatafloat;

        //Narrowing
        int tipedataint2 = 127;
        byte tipedatabyte2 = (byte) tipedataint2;
        System.out.println(tipedatabyte2);

    }
}
