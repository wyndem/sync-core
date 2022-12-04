package cn.wenhaha.sync.core;

public enum QueryType {

    NUILL(1,"空"),
    STRING(2,"字符串"),
    NUMBER(3,"数字类型"),
    Custom(4,"自定义")
    ;

    private  Integer id;
    private  String name;

    QueryType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static QueryType findByQueryType(Integer id){
        for (QueryType q:values()) {
            if (q.id.equals(id)){
                return  q;
            }
        }
        return null;
    }
}
