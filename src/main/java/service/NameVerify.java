package service;

public class NameVerify {
    private String name;
    private String[] blockedNames;

    public NameVerify(String name, String[] blockedNames) {
        this.name = name;
        this.blockedNames = blockedNames;
    }

    public boolean nameIsBlocked(){
        for (String blocked : blockedNames){
            if (name.equalsIgnoreCase(blocked)){
                return true;
            }
        }
        return false;
    }

    public boolean numberVerify(){
        // se tem numero estiver presente deve retonar um true
        for (int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            if (Character.isDigit(c)){
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

    public String[] getBlockedNames() {
        return blockedNames;
    }

    public void setBlockedNames(String[] blockedNames) {
        this.blockedNames = blockedNames;
    }
}
