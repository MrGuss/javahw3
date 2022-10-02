package task33;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Formatter;

public class report {
    static void generateReport(employee[] employees) {
        int len = 0;
        DecimalFormat formatter = new DecimalFormat("####.##");
        for (employee empl : employees) {
            if (len < empl.fullname.length()) {
                len = empl.fullname.length();
            }
        }
        System.out.println(len);
        for (employee empl : employees) {
            System.out.println(String.format("%7s", formatter.format(empl.salary)) + " " + empl.fullname);
        }
    }
    public static void main(String[] args) {
        employee[] staff = new employee[5];
        staff[0] = new employee("John", Math.random() * 1500);
        staff[1] = new employee("Ken", Math.random() * 1500);
        staff[2] = new employee("Kirk", Math.random() * 1500);
        staff[3] = new employee("Tom", Math.random() * 1500);
        staff[4] = new employee("Oleg", Math.random() * 1500);

        generateReport(staff);

    }
}
