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

    private final Map<String,IUserContext<?>> userContextMap = new HashMap<>(2);

    private final ThreadLocal<Integer> userId = new ThreadLocal<Integer>();
    private final ThreadLocal<String> objectName = new ThreadLocal<String>();
    private final ThreadLocal<String> pluginsCode = new ThreadLocal<String>();


    @Override
    public void addDataSource( String pluginCode, IUserContext<?> userContext) {
        userContextMap.put(pluginCode,userContext);
    }

    @Override
    public void beforeEvent(Integer userId, String objectName,String pluginCode) {
        this.userId.set(userId);
        this.objectName.set(objectName);
        this.pluginsCode.set(pluginCode);
    }


    @Override
    public void afterEvent() {
        this.userId.remove();
        this.objectName.remove();
        this.pluginsCode.remove();
    }

    public  <T>  IUserContext<T> getUserContext(){
        return (IUserContext<T>) userContextMap.get(this.pluginsCode.get());
    }


    public Integer getUserId(){
        return  this.userId.get();
    }


    public String getObjectName(){
        return this.objectName.get();
    }

    public String getPluginCode() {
        return this.pluginsCode.get();
    }
}
