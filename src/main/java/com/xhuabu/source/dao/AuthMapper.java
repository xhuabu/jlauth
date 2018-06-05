package com.xhuabu.source.dao;

import com.xhuabu.source.model.po.Auth;
import com.xhuabu.source.model.po.AuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    long countByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int deleteByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int insert(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int insertSelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    List<Auth> selectByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    Auth selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") Auth record, @Param("example") AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int updateByExample(@Param("record") Auth record, @Param("example") AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int updateByPrimaryKeySelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated Tue Jun 05 22:13:21 CST 2018
     */
    int updateByPrimaryKey(Auth record);
}