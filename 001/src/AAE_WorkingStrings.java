import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class AAE_WorkingStrings {
    public static void main(String[] args) {
        String name = "Krishnamurtir";

        //easy to understand
        String NameUpper = name.toUpperCase();
        System.out.println(NameUpper);

        String NameLower = name.toLowerCase();
        System.out.println(NameLower);

        //amount character
        System.out.println(name.length());

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());

        Locale brasil = new Locale("pt", "BR");
        String week_Day = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(week_Day);

    }
}
