package com.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 */
public class Folder implements Ifile{
    private String fileName;//文件名
    private List<Ifile> list = null;//目录集合
    public Folder(String fileName){
        this.fileName = fileName;
        this.list = new ArrayList<Ifile>();
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }

    @Override
    public boolean add(Ifile file) {
        this.list.add(file);
        return true;
    }

    @Override
    public boolean remove(Ifile file) {
        this.list.add(file);
        return true;
    }

    @Override
    public List<Ifile> getChild() {
        return this.list;
    }
}
