package com.itemheima.mapper;

import com.itemheima.pojo.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ArticleMapper {

    //新增
    @Insert("insert into article(title,content,cover_img,state,category_id,create_user,create_time,update_time)"+
    "values(#{title},#{content},#{coverImg},#{state},#{categoryId},#{createUser},#{createTime},#{updateTime})")
    void add(Article article);

    //文章列表
    List<Article> list(Integer userId, Integer categoryId, String state);
    //按id查询文章
    @Select("select * from article where id = #{id}")
    Article findById(Integer id);
    //更新文章
    @Update("update article set title=#{title},content=#{content},cover_img=#{coverImg},state=#{state}," +
            "category_id=#{categoryId},update_time=now() where id=#{id}")
    void update(Article article);
    //删除文章
    @Delete("delete from article where id = #{id}")
    void delete(Integer id);
}
