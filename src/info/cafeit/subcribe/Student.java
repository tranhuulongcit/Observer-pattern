package info.cafeit.subcribe;

import info.cafeit.publish.Subject;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.getName() + ": " + message);
    }

    @Override
    public void subcribe(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void dispose(Subject subject) {
        subject.detach(this);
    }
}
