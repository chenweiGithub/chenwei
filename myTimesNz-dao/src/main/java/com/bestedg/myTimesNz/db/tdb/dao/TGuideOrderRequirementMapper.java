package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TGuideOrderRequirement;
import com.bestedg.myTimesNz.db.tdb.entity.TGuideOrderRequirementExample;
import java.util.List;

public interface TGuideOrderRequirementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TGuideOrderRequirement record);

    int insertSelective(TGuideOrderRequirement record);

    List<TGuideOrderRequirement> selectByExample(TGuideOrderRequirementExample example);

    TGuideOrderRequirement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGuideOrderRequirement record);

    int updateByPrimaryKey(TGuideOrderRequirement record);
}