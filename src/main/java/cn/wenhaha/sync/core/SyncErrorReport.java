package cn.wenhaha.sync.core;

import cn.hutool.db.Entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 上传异常数据
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-08-15 22:15
 */
public class SyncErrorReport extends SyncReport implements Serializable {



    private String simpleError;

    private Exception exception;

    private Date  date;

    private Entity data;

    public SyncErrorReport(String pluginsCode, String objectName, Integer userId, Serializable dataId, String simpleError, Exception exception, Entity data) {
        super(pluginsCode, objectName, userId, dataId);
        this.simpleError = simpleError;
        this.exception = exception;
        this.date = new Date();
        this.data = data;
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

    public Entity getData() {
        return data;
    }

    public void setData(Entity data) {
        this.data = data;
    }


}
