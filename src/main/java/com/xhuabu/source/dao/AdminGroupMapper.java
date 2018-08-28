package com.xhuabu.source.dao;

import com.xhuabu.source.model.po.AdminGroup;
import com.xhuabu.source.model.po.AdminGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    long countByExample(AdminGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int deleteByExample(AdminGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int insert(AdminGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int insertSelective(AdminGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    List<AdminGroup> selectByExample(AdminGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    AdminGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int updateByExampleSelective(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int updateByExample(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int updateByPrimaryKeySelective(AdminGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_group
     *
     * @mbg.generated Wed Jul 11 17:08:55 CST 2018
     */
    int updateByPrimaryKey(AdminGroup record);
}