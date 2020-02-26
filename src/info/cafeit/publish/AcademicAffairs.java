package info.cafeit.publish;

import info.cafeit.subcribe.Observer;

import java.util.ArrayList;
import java.util.List;

public class AcademicAffairs implements Subject {

    private final List<Observer> users;

    public AcademicAffairs() {
        users = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        if (!users.contains(observer)) {
            users.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if (users.contains(observer)) {
            users.remove(observer);
        }
    }

    @Override
    public void notifyAll(String message) {
        for (Observer ob : users) {
            ob.update(message);
        }
    }

    @Override
    public void notifyTo(Observer observer, String message) {
        Observer o = find(observer);
        if (o != null) {
            o.update(message);
        }
    }

    private Observer find(Observer observer) {
        return users.get(users.indexOf(observer));
    }

}
