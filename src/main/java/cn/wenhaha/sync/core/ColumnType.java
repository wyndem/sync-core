package cn.wenhaha.sync.core;


/**
 * <p>
 *    字段类型
 * </p>
 * @Author: Wyndem
 * @DateTime: 2022-11-13 11:11
 */
public enum ColumnType {

    column(1,"字段"),
    constant(2,"常量"),
    sourceLookup(3,"本源查找"),
    custom(4,"自定义")
    ;

    private  Integer id;
    private  String name;

    ColumnType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static ColumnType findByQueryType(String name){
        for (ColumnType q:values()) {
            if (q.name.equals(name)){
                return  q;
            }
        }
        return null;
    }
}
