package com.neuedu.mapper;

import com.neuedu.entity.ApplyChecking;
import com.neuedu.entity.ApplyCheckingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyCheckingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    long countByExample(ApplyCheckingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int deleteByExample(ApplyCheckingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int deleteByPrimaryKey(Integer applyCheckId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int insert(ApplyChecking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int insertSelective(ApplyChecking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    List<ApplyChecking> selectByExample(ApplyCheckingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    ApplyChecking selectByPrimaryKey(Integer applyCheckId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") ApplyChecking record, @Param("example") ApplyCheckingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByExample(@Param("record") ApplyChecking record, @Param("example") ApplyCheckingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByPrimaryKeySelective(ApplyChecking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_checking
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    int updateByPrimaryKey(ApplyChecking record);
}