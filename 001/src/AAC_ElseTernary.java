public class AAC_ElseTernary {

    public static void main(String[] args) {
        String jobTitle = "PM";
        String msgOK = "You're approved";
        String msgNOK = "Next time";

        String showMsg = jobTitle == "PM" ? msgOK : msgNOK;

        System.out.println(showMsg);

    }
}
