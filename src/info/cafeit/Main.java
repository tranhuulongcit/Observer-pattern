package info.cafeit;

import info.cafeit.publish.AcademicAffairs;
import info.cafeit.publish.Subject;
import info.cafeit.subcribe.Observer;
import info.cafeit.subcribe.Student;
import info.cafeit.subcribe.Teacher;

public class Main {

    public static void main(String[] args) {
        AcademicAffairs phongDaoTao = new AcademicAffairs();
        Student nam = new Student("Nguyễn Văn Nam");
        Student huy = new Student("Trần Ngọc Huy");
        Student hung = new Student("Lê Văn Hùng");
        Teacher thai = new Teacher("Lê Minh Thái");

        subcribe(phongDaoTao, nam);
        subcribe(phongDaoTao, huy);
        subcribe(phongDaoTao, hung);
        subcribe(phongDaoTao, thai);

        phongDaoTao.notifyAll("Thông báo nghỉ do dịch COVID-19.");
        System.out.println("---------------------------------");
        phongDaoTao.notifyTo(thai, "Thông báo thay đổi lịch dạy ngày 20/04/2019.");
        System.out.println("---------------------------------");
        dispose(phongDaoTao, hung);
        phongDaoTao.notifyAll("Thông báo lịch học phần.");
    }

    private static void subcribe(Subject subject, Observer observer) {
        subject.attach(observer);
    }

    private static void dispose(Subject subject, Observer obServer) {
        subject.detach(obServer);
    }

}
