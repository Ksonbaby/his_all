package com.neuedu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ApplyInspect implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.apply_inspect_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private Integer applyInspectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.medical_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private Integer medicalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.inspect_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private Integer inspectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.inspect_name
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private String inspectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.fee
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private BigDecimal fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.status
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.is_del
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private String isDel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_apply_inspect.create_time
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_apply_inspect
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.apply_inspect_id
     *
     * @return the value of t_apply_inspect.apply_inspect_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public Integer getApplyInspectId() {
        return applyInspectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.apply_inspect_id
     *
     * @param applyInspectId the value for t_apply_inspect.apply_inspect_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setApplyInspectId(Integer applyInspectId) {
        this.applyInspectId = applyInspectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.medical_id
     *
     * @return the value of t_apply_inspect.medical_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public Integer getMedicalId() {
        return medicalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.medical_id
     *
     * @param medicalId the value for t_apply_inspect.medical_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.inspect_id
     *
     * @return the value of t_apply_inspect.inspect_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public Integer getInspectId() {
        return inspectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.inspect_id
     *
     * @param inspectId the value for t_apply_inspect.inspect_id
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.inspect_name
     *
     * @return the value of t_apply_inspect.inspect_name
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public String getInspectName() {
        return inspectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.inspect_name
     *
     * @param inspectName the value for t_apply_inspect.inspect_name
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setInspectName(String inspectName) {
        this.inspectName = inspectName == null ? null : inspectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.fee
     *
     * @return the value of t_apply_inspect.fee
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.fee
     *
     * @param fee the value for t_apply_inspect.fee
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.status
     *
     * @return the value of t_apply_inspect.status
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.status
     *
     * @param status the value for t_apply_inspect.status
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.is_del
     *
     * @return the value of t_apply_inspect.is_del
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.is_del
     *
     * @param isDel the value for t_apply_inspect.is_del
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_apply_inspect.create_time
     *
     * @return the value of t_apply_inspect.create_time
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_apply_inspect.create_time
     *
     * @param createTime the value for t_apply_inspect.create_time
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_inspect
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyInspectId=").append(applyInspectId);
        sb.append(", medicalId=").append(medicalId);
        sb.append(", inspectId=").append(inspectId);
        sb.append(", inspectName=").append(inspectName);
        sb.append(", fee=").append(fee);
        sb.append(", status=").append(status);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}