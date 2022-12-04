package cn.wenhaha.sync.core;

import cn.hutool.db.Entity;

import java.io.Serializable;

/**
 * 上传成功后的数据
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-11-19 12:38
 */
public class SyncSuccessReport extends SyncReport  implements Serializable {

    /** 上传完成后 对方生成的id **/
    private Entity data;


    public SyncSuccessReport(String pluginsCode, String objectName, Integer userId, Serializable dataId, Entity data) {
        super(pluginsCode, objectName, userId, dataId);
        this.data = data;
    }

    public Entity getData() {
        return data;
    }
}
