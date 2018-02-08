package com.xhuabu.source.model.po;

import java.util.Date;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.parent_id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.create_time
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.update_time
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.name
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.uri
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private String uri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.create_admin_id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private Integer createAdminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.comment
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menus.weight
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    private Integer weight;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.id
     *
     * @return the value of menus.id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.id
     *
     * @param id the value for menus.id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.parent_id
     *
     * @return the value of menus.parent_id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.parent_id
     *
     * @param parentId the value for menus.parent_id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.create_time
     *
     * @return the value of menus.create_time
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.create_time
     *
     * @param createTime the value for menus.create_time
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.update_time
     *
     * @return the value of menus.update_time
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.update_time
     *
     * @param updateTime the value for menus.update_time
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.name
     *
     * @return the value of menus.name
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.name
     *
     * @param name the value for menus.name
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.uri
     *
     * @return the value of menus.uri
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.uri
     *
     * @param uri the value for menus.uri
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.create_admin_id
     *
     * @return the value of menus.create_admin_id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public Integer getCreateAdminId() {
        return createAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.create_admin_id
     *
     * @param createAdminId the value for menus.create_admin_id
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setCreateAdminId(Integer createAdminId) {
        this.createAdminId = createAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.comment
     *
     * @return the value of menus.comment
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.comment
     *
     * @param comment the value for menus.comment
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menus.weight
     *
     * @return the value of menus.weight
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menus.weight
     *
     * @param weight the value for menus.weight
     *
     * @mbg.generated Mon Jan 29 15:54:58 CST 2018
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}