package com.pattern;

import java.util.List;

/**
 * Ifile 统一接口
 */
public interface Ifile {
    void display();//显示
    boolean add(Ifile file);//添加
    boolean remove(Ifile file);//删除
    List<Ifile> getChild();//获取孩子节点
}
