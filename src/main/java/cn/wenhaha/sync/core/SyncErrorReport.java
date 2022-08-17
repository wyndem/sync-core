package cn.wenhaha.sync.core;

import java.io.Serializable;
import java.util.Date;


/**
 * 上传异常数据
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-08-15 22:15
 */
public class SyncErrorReport implements Serializable {

    private Integer pluginsId;

    private String objectName;

    private Integer userId;

    private Serializable dataId;

    private String simpleError;

    private Exception exception;

    private Date  date;


    public SyncErrorReport(Integer pluginsId, String objectName, Integer userId, Serializable dataId, String simpleError, Exception exception) {
        this.pluginsId = pluginsId;
        this.objectName = objectName;
        this.userId = userId;
        this.dataId = dataId;
        this.simpleError = simpleError;
        this.exception = exception;
        this.date = new Date();
    }

    public Integer getPluginsId() {
        return pluginsId;
    }

    public void setPluginsId(Integer pluginsId) {
        this.pluginsId = pluginsId;
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

    public String getSimpleError() {
        return simpleError;
    }

    public void setSimpleError(String simpleError) {
        this.simpleError = simpleError;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
