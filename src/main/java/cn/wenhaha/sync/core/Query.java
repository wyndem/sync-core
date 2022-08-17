package cn.wenhaha.sync.core;

import lombok.Data;


/**
 *  查询体
 *   可以嵌套
 */
@Data
public class Query {

    
    /** 字段名 */
    private String name;

    /** 符号 **/
    private  Signal signal;

    /** 字段类型 */
    private QueryType type;
    /** 值 */
    private Object  value;
    
}