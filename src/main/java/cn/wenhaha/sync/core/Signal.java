package cn.wenhaha.sync.core;

public enum Signal {


    EQ("=","等于"),
    NQ("!=","不等于"),
    LT("<","小于"),
    LEQ("<=","小于等于"),
    GT(">","大于"),
    GEQ(">=","大于等于")
    ;

    private  String id;

    private  String name;

    Signal(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static Signal findBySignal(String id){
        for (Signal q:values()) {
            if (q.id.equals(id)){
                return  q;
            }
        }
        return null;
    }
}
