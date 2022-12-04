package cn.wenhaha.sync.core;

public enum Join {

    AND("and"),
    OR("or");

    private final String value;

    Join(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }


    public static Join findByJoin(String v){
        for (Join q:values()) {
            if (q.value.equals(v)){
                return  q;
            }
        }
        return null;
    }
}
