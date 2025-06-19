package service;

public class NameVerify {
    public String name;
    private String[] blockedName;

    public NameVerify(String name, String[] blockedName) {
        this.name = name;
        this.blockedName = blockedName;
    }

    public boolean nameIsBlocked(){
        for (String blocked : blockedName){
            if (name.equalsIgnoreCase(blocked)){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getBlockedName() {
        return blockedName;
    }

    public void setBlockedName(String[] blockedName) {
        this.blockedName = blockedName;
    }
}
