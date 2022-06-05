package lab1.Singleton;

class Connection {
    private static Connection instance;

    public static Connection getInstance() {
        if(null != instance)
            return instance;
        instance = new Connection();
        return instance;
    }
}
