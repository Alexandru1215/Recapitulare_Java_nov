package recap.pack;

public final class SingletonCheck {
    private static SingletonCheck _instance;

    public static SingletonCheck getInstance() {
        if (_instance == null) {
            synchronized (SingletonCheck.class) {
                if (_instance == null) {
                    _instance = new SingletonCheck();

                }
            }
        }
        return _instance;
    }
}
