package cn.wenhaha.sync.core;

import cn.wenhaha.datasource.IUserContext;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单的同步核心抽象类
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-08-15 22:36
 */
public abstract class BaseSyncCore  implements  DataSyncCoreContext{

    private final Map<Integer,IUserContext<?>> userContextMap = new HashMap<>(2);

    private final ThreadLocal<Integer> userId = new ThreadLocal<Integer>();
    private final ThreadLocal<String> objectName = new ThreadLocal<String>();
    private final ThreadLocal<Integer> pluginsId = new ThreadLocal<Integer>();


    @Override
    public void addDataSource(Integer pluginsId, String pluginCode, IUserContext<?> userContext) {
        userContextMap.put(pluginsId,userContext);
    }

    @Override
    public void beforeEvent(Integer userId, String objectName, Integer pluginsId) {
        this.userId.set(userId);
        this.objectName.set(objectName);
        this.pluginsId.set(pluginsId);
    }


    @Override
    public void afterEvent() {
        this.userId.remove();
        this.objectName.remove();
        this.pluginsId.remove();
    }

    public  <T>  IUserContext<T> getUserContext(){
        return (IUserContext<T>) userContextMap.get(this.pluginsId.get());
    }


    public Integer getUserId(){
        return  this.userId.get();
    }


    public String getObjectName(){
        return this.objectName.get();
    }

    public Integer getPluginsId() {
        return this.pluginsId.get();
    }
}
