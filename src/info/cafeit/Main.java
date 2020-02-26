package info.cafeit;

import info.cafeit.publish.AcademicAffairs;
import info.cafeit.subcribe.Student;
import info.cafeit.subcribe.Teacher;

public class Main {

    public static void main(String[] args) {
        AcademicAffairs phongDaoTao = new AcademicAffairs();
        Student nam = new Student("Nguyen Van Nam");
        Student binh = new Student("Truong Gia Binh");
        Student quoc = new Student("Le Cong Quoc");
        Teacher hung = new Teacher("Le Hung");

        nam.subcribe(phongDaoTao);
        binh.subcribe(phongDaoTao);
        quoc.subcribe(phongDaoTao);
        hung.subcribe(phongDaoTao);

        phongDaoTao.notifyAll("Thông báo nghỉ do dịch COVID-19.");
        phongDaoTao.notifyTo(hung, "Thông báo thay đổi lịch dạy ngày 20/04/2019.");
    }


}
