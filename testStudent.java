package BMITest;

import java.util.ArrayList;
import java.util.Iterator;

public class testStudent {
    public static void main(String[] args) {

    	ArrayList<student> list = new ArrayList<student>();

        student a = new student("1001", "Wang", 1.66, 50);
        student b = new student("1002", "Sun", 1.77, 100.1);
        student c = new student("1003", "Zhao", 1.80, 90);
        student d = new student("1004", "Li", 1.76, 73.9);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        System.out.println("学号"+"   "+" 姓名" + "  " + "  BMI值"+ "   "+"提示信息");
        Iterator<student> it = list.iterator();
        while (it.hasNext()) {
            student s = it.next();
            System.out.print(s.getID() + "   " + s.getName() + "   ");
            s.getBMI();
        }
    }

}
