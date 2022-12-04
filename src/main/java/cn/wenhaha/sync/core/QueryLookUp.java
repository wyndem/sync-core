package cn.wenhaha.sync.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查找关系
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-11-13 11:15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryLookUp {

    /** 查找的对象名称**/
    private String objName;
    /** 查找的对象字段 **/
    private String column;
    /** 条件关联，这是目标对象的字段 **/
    private String linkColumn;
    /** 这是当前已知的字段 **/
    private String currentColumn;

}
