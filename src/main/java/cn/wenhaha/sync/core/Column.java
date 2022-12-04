package cn.wenhaha.sync.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 列字段
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-11-13 11:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Column {
    /** 字段名称 **/
    private String column;
    /** 字段查找类型 **/
    private  ColumnType type;
    /** 查找具体实现 **/
    private Object value;

}
