package cn.wenhaha.sync.core;

import java.io.Serializable;

/**
 * 同步反馈
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-11-19 12:39
 */
public abstract class SyncReport implements Serializable {


    private String pluginsCode;
    private String objectName;
    private Integer userId;
    private Serializable dataId;


    public SyncReport(String pluginsCode, String objectName, Integer userId, Serializable dataId) {
        this.pluginsCode = pluginsCode;
        this.objectName = objectName;
        this.userId = userId;
        this.dataId = dataId;
    }


    public String getPluginsCode() {
        return pluginsCode;
    }

    public void setPluginsCode(String pluginsCode) {
        this.pluginsCode = pluginsCode;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Serializable getDataId() {
        return dataId;
    }

    public void setDataId(Serializable dataId) {
        this.dataId = dataId;
    }
}
