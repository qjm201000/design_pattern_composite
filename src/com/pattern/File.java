package com.pattern;

import java.util.List;

/**
 * 文件
 */
public class File implements Ifile{
    private String fileName;//文件名
    public File(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }

    @Override
    public boolean add(Ifile file) {
        return false;
    }
    @Override
    public boolean remove(Ifile file) {
        return false;
    }
    @Override
    public List<Ifile> getChild() {
        return null;
    }
}
