package udemy_tutorial;

import org.w3c.dom.ls.LSOutput;

public class DbConnection {

    private static DbConnection INSTANCE = new DbConnection();

    private DbConnection(){
    };

    public static DbConnection getINSTANCE() {
        return INSTANCE;
    }

    private String name;
    private String dbtype;

    public String getName() {
        return name;
    }

    public String getDbtype() {
        return dbtype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDbtype(String dbtype) {
        this.dbtype = dbtype;
    }


}