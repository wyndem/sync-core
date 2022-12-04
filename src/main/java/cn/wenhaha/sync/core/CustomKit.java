package cn.wenhaha.sync.core;

import cn.hutool.core.util.StrUtil;

/**
 * 去除前缀工具类
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-12-04 15:14
 */
public class CustomKit {



    public  static String rmPrefix(String custom){
        if (StrUtil.isEmpty(custom) || StrUtil.length(custom) == 1){
            return  custom;
        }
        int i = StrUtil.indexOf(custom, ':');
        if (i==-1){
            return custom;
        }
        return  custom.substring(i+1);
    }

}
