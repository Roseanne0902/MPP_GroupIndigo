package lab11.partB.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    private MySingletonLazy() {
        System.out.println("Constructor created.");
    }

    private static MySingletonLazy createInstance() {
        System.out.println("Create Instance.");
        instance = new MySingletonLazy();
        return instance;
    }

    public static MySingletonLazy getInstanceWithOrElseGet() {
        return Optional.ofNullable(instance)
                .orElseGet(MySingletonLazy::createInstance);
    }

    public static MySingletonLazy getInstanceWithOrElse() {
        return Optional.ofNullable(instance)
                .orElse(createInstance());
    }

    public static void main(String[] args) {
        MySingletonLazy s1 = MySingletonLazy.getInstanceWithOrElseGet();

        MySingletonLazy s2 = MySingletonLazy.getInstanceWithOrElseGet();

        MySingletonLazy s3 = MySingletonLazy.getInstanceWithOrElse();

        System.out.println("s1 == s2? " + (s1 == s2));

        System.out.println("s2 == s3? " + (s2 == s3));
    }
}