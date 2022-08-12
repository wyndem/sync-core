package cn.wenhaha.sync.core;

import cn.hutool.db.Entity;

import java.util.List;

/**
 * 数据处理管理器
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-08-11 21:13
 */
public interface DataManage {


    /**
     *  查询：
     *      1. 待同步的数据
     *      2. 需要定制的关联关系
     */
    List<Entity> query(Integer userId,String objectName,List<String> field, List<Query> query);



    //更新



}
