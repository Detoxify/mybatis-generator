package com.pana.generator.dao;

import com.pana.generator.entity.MaintainCarInfo;
import com.pana.generator.entity.MaintainCarInfoExample;
import com.pana.generator.entity.MaintainCarInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainCarInfoMapper {
    int countByExample(MaintainCarInfoExample example);

    int deleteByExample(MaintainCarInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaintainCarInfoWithBLOBs record);

    int insertSelective(MaintainCarInfoWithBLOBs record);

    List<MaintainCarInfoWithBLOBs> selectByExampleWithBLOBs(MaintainCarInfoExample example);

    List<MaintainCarInfo> selectByExample(MaintainCarInfoExample example);

    MaintainCarInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaintainCarInfoWithBLOBs record, @Param("example") MaintainCarInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") MaintainCarInfoWithBLOBs record, @Param("example") MaintainCarInfoExample example);

    int updateByExample(@Param("record") MaintainCarInfo record, @Param("example") MaintainCarInfoExample example);

    int updateByPrimaryKeySelective(MaintainCarInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MaintainCarInfoWithBLOBs record);

    int updateByPrimaryKey(MaintainCarInfo record);
}