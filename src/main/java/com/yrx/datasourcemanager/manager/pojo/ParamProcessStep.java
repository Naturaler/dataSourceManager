package com.yrx.datasourcemanager.manager.pojo;

import java.util.Date;

public class ParamProcessStep {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.api_id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private Integer apiId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.param_id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private Integer paramId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.process_type
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private String processType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.process_value
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private String processValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.create_author
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private String createAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.create_time
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.update_author
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private String updateAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column param_process_step.update_time
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.id
     *
     * @return the value of param_process_step.id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.id
     *
     * @param id the value for param_process_step.id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.api_id
     *
     * @return the value of param_process_step.api_id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public Integer getApiId() {
        return apiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.api_id
     *
     * @param apiId the value for param_process_step.api_id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.param_id
     *
     * @return the value of param_process_step.param_id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public Integer getParamId() {
        return paramId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.param_id
     *
     * @param paramId the value for param_process_step.param_id
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.process_type
     *
     * @return the value of param_process_step.process_type
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.process_type
     *
     * @param processType the value for param_process_step.process_type
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setProcessType(String processType) {
        this.processType = processType == null ? null : processType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.process_value
     *
     * @return the value of param_process_step.process_value
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public String getProcessValue() {
        return processValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.process_value
     *
     * @param processValue the value for param_process_step.process_value
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setProcessValue(String processValue) {
        this.processValue = processValue == null ? null : processValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.create_author
     *
     * @return the value of param_process_step.create_author
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public String getCreateAuthor() {
        return createAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.create_author
     *
     * @param createAuthor the value for param_process_step.create_author
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setCreateAuthor(String createAuthor) {
        this.createAuthor = createAuthor == null ? null : createAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.create_time
     *
     * @return the value of param_process_step.create_time
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.create_time
     *
     * @param createTime the value for param_process_step.create_time
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.update_author
     *
     * @return the value of param_process_step.update_author
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public String getUpdateAuthor() {
        return updateAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.update_author
     *
     * @param updateAuthor the value for param_process_step.update_author
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setUpdateAuthor(String updateAuthor) {
        this.updateAuthor = updateAuthor == null ? null : updateAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column param_process_step.update_time
     *
     * @return the value of param_process_step.update_time
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column param_process_step.update_time
     *
     * @param updateTime the value for param_process_step.update_time
     *
     * @mbg.generated Mon Sep 02 00:18:58 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}