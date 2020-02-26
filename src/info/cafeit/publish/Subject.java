package info.cafeit.publish;

import info.cafeit.subcribe.Observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAll(String message);

    void notifyTo(Observer observer, String message);
}
