package com.itemheima.service;

import com.itemheima.pojo.Category;

import java.util.List;

public interface CategoryService {
    //创建
    void add(Category category);
    //查询文章列表
    List<Category> list();
    //id查询分类信息
    Category findById(Integer id);
    //更新
    void update(Category category);
    //删除
    void delete(Integer id);
}
