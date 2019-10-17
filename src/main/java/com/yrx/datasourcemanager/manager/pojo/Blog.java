package com.yrx.datasourcemanager.manager.pojo;

import java.util.Date;

public class Blog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.id
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.title
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.description
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.tags
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.insert_time
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private Date insertTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.update_time
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.soft_delete
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private Byte softDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.blog
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    private String blog;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.id
     *
     * @return the value of blog.id
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.id
     *
     * @param id the value for blog.id
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.title
     *
     * @return the value of blog.title
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.title
     *
     * @param title the value for blog.title
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.description
     *
     * @return the value of blog.description
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.description
     *
     * @param description the value for blog.description
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.tags
     *
     * @return the value of blog.tags
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.tags
     *
     * @param tags the value for blog.tags
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.insert_time
     *
     * @return the value of blog.insert_time
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.insert_time
     *
     * @param insertTime the value for blog.insert_time
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.update_time
     *
     * @return the value of blog.update_time
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.update_time
     *
     * @param updateTime the value for blog.update_time
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.soft_delete
     *
     * @return the value of blog.soft_delete
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public Byte getSoftDelete() {
        return softDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.soft_delete
     *
     * @param softDelete the value for blog.soft_delete
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setSoftDelete(Byte softDelete) {
        this.softDelete = softDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.blog
     *
     * @return the value of blog.blog
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public String getBlog() {
        return blog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.blog
     *
     * @param blog the value for blog.blog
     *
     * @mbg.generated Thu Oct 17 23:55:57 CST 2019
     */
    public void setBlog(String blog) {
        this.blog = blog == null ? null : blog.trim();
    }
}