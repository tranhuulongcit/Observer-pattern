package info.cafeit.subcribe;

import info.cafeit.publish.Subject;

public interface Observer {
    void update(String message);

    void subcribe(Subject subject);

    void dispose(Subject subject);
}
