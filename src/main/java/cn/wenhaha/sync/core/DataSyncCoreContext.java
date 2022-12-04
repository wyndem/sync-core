package cn.wenhaha.sync.core;

import cn.hutool.db.Entity;
import cn.wenhaha.datasource.IUserContext;
import java.util.List;

/**
 *
 * 同步核心上下文
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-08-11 21:12
 */
public interface DataSyncCoreContext {

    /**
     *  添加 数据源
     * @param pluginsId 插件id
     * @param pluginCode 插件code
     * @param userContext 对应的数据源
     */
    void addDataSource(String pluginCode,IUserContext<?> userContext);


    /**
     * 调用之前事件
     * @param userId 用户id
     * @param pluginsId 插件id
     * @param objectName  对象名称
     */
    void beforeEvent(Integer userId,String objectName,String pluginCode);


    /**
     *  查询：
     *      1. 待同步的数据
     *      2. 需要定制的关联关系
     */
    List<Entity> query(List<Column> field, List<Query> query);


    /**
     * <p>
     *    是否支持改类型的回显
     * </p>
     * @Author: Wyndem
     * @DateTime: 2022-12-04 15:12
     */
    Boolean isEchoQuery(String type);


    /**
     * <p>
     *     回显 -> 自定义操作
     * </p>
     * @param column  一个column代表着一个回写字段。一组是当前对象的所有回写
     * @Author: Wyndem
     * @DateTime: 2022-11-22 22:10
     */
    Entity  echoQuery(List<Column> column);


    /**
     *  上传数据：
     *      1. 新增
     *      2. 保存
     * @param id  对于数据中id字段
     * @param data  数据
     */
    List<SyncReport> upload(String id,List<Entity> data);


    /**
     *  之后调用
     */
    void afterEvent();


}
