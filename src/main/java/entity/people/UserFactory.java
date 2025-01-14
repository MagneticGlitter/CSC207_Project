package entity.people;

import java.time.LocalDateTime;

public interface UserFactory {
    User create(String name, String password, LocalDateTime ldt);
}
