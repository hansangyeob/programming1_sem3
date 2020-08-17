package udemy_tutorial;

public class DbConnection {

    private static DbConnection isConnect = new DbConnection();

    private DbConnection(){
        };

    public static DbConnection getIsConnect() {
        return isConnect;
    }

        private String name;
        private String databaseType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

}