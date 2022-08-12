package cn.wenhaha.sync.core;

import cn.wenhaha.datasource.IUserContext;

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
    void addDataSource(Integer pluginsId,String pluginCode,IUserContext userContext);


    DataManage dataManage();


}
