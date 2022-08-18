package cn.wenhaha.sync.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *  查询体
 *   可以嵌套
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Query {

    
    /** 字段名 */
    private String name;

    /** 符号 **/
    private  Signal signal;

    /** 字段类型 */
    private QueryType type;

    /** 值 */
    private Object  value;

    /** 连接符号 **/
    private  Join join;


}