package com.xhuabu.source.dao;

import com.xhuabu.source.model.po.GroupMenu;
import com.xhuabu.source.model.po.GroupMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    long countByExample(GroupMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int deleteByExample(GroupMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int insert(GroupMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int insertSelective(GroupMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    List<GroupMenu> selectByExample(GroupMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    GroupMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int updateByExampleSelective(@Param("record") GroupMenu record, @Param("example") GroupMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int updateByExample(@Param("record") GroupMenu record, @Param("example") GroupMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int updateByPrimaryKeySelective(GroupMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_menu
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    int updateByPrimaryKey(GroupMenu record);
}