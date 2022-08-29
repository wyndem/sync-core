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
    void addDataSource(Integer pluginsId,String pluginCode,IUserContext<?> userContext);

    /**
     * <p>
     *    支持数据源插件的code
     * </p>
     * @Author: Wyndem
     * @DateTime: 2022-08-29 20:02
     */
    String[] supportPluginsCode();

    /**
     * 调用之前事件
     * @param userId 用户id
     * @param pluginsId 插件id
     * @param objectName  对象名称
     */
    void beforeEvent(Integer userId,String objectName,Integer pluginsId);


    /**
     *  查询：
     *      1. 待同步的数据
     *      2. 需要定制的关联关系
     */
    List<Entity> query(List<String> field, List<Query> query);

    /**
     * 单字段 批量查询
     * @param field 查询的字段
     * @param query 查询条件
     * @return 根据查询条件依次返回
     */
    <T> List<T>  batchQuery(String field,List<List<Query>> query);


    /**
     *  上传数据：
     *      1. 新增
     *      2. 保存
     * @param id  对于数据中id字段
     * @param data  数据
     */
    List<SyncErrorReport> upload(String id,List<Entity> data);


    /**
     *  之后调用
     */
    void afterEvent();


}
