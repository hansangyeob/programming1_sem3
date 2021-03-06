package udemy_tutorial;

public class OrgUnit {

    private String id;
    private String name;
    private OrgUnit parents;

    public OrgUnit(String id,String name,OrgUnit parents){
        this.id = id;
        this.name = name;
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgUnit getParents() {
        return parents;
    }

    public void setParents(OrgUnit parents) {
        this.parents = parents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
