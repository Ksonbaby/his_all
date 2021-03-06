package com.neuedu.mapper;

import com.neuedu.entity.DoctorLevel;
import com.neuedu.entity.DoctorLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    long countByExample(DoctorLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int deleteByExample(DoctorLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int deleteByPrimaryKey(Integer levelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int insert(DoctorLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int insertSelective(DoctorLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    List<DoctorLevel> selectByExample(DoctorLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    DoctorLevel selectByPrimaryKey(Integer levelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") DoctorLevel record, @Param("example") DoctorLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByExample(@Param("record") DoctorLevel record, @Param("example") DoctorLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByPrimaryKeySelective(DoctorLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_doctor_level
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByPrimaryKey(DoctorLevel record);
}