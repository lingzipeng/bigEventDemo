package com.itemheima.service;

import com.itemheima.pojo.Article;
import com.itemheima.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);
    //查询文章
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
    //按id查询文章
    Article findById(Integer id);
    //更新文章
    void update(Article article);
    //删除文章
    void delete(Integer id);
}
