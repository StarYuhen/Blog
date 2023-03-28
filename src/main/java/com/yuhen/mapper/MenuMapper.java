package com.yuhen.mapper;

import com.yuhen.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface MenuMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Menu record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Menu record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Menu selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Menu record);

    @Select("select m.*, r.*, r.id as rid from menu m " +
            " left join menu_role mr on mr.mid = m.id " +
            "left join role r on r.id = mr.rid ")
    @ResultMap(value = "MenuAndRole")
    List<Menu> getAllMenu();
}

