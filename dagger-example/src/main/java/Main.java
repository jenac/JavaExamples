import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {

        User u = new User();
        u.setUsername("jenac");
        System.out.println("hello, world");
        System.out.println(u.getUsername());
        log.error("Error occurred", new RuntimeException("Planned"));
    }
}
