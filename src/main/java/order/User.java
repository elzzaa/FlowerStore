package order;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public interface User {
    static void update(boolean status) {
        System.out.println("Success");
    }
}
