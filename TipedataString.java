public class TipedataString {
    public static void main(String[] args) {
        String firstname = "Poda";
        String lastname = "Damanik";

        //String fullname = firstname + " " + lastname;
        //System.out.println(fullname);

        String fullname = firstname.concat(" ").concat(lastname);
        System.out.println(fullname);
    }
}
