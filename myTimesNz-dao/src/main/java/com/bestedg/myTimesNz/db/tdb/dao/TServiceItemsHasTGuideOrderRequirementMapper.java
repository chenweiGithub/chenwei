package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsHasTGuideOrderRequirement;
import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsHasTGuideOrderRequirementExample;
import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsHasTGuideOrderRequirementKey;
import java.util.List;

public interface TServiceItemsHasTGuideOrderRequirementMapper {
    int deleteByPrimaryKey(TServiceItemsHasTGuideOrderRequirementKey key);

    int insert(TServiceItemsHasTGuideOrderRequirement record);

    int insertSelective(TServiceItemsHasTGuideOrderRequirement record);

    List<TServiceItemsHasTGuideOrderRequirement> selectByExample(TServiceItemsHasTGuideOrderRequirementExample example);

    TServiceItemsHasTGuideOrderRequirement selectByPrimaryKey(TServiceItemsHasTGuideOrderRequirementKey key);

    int updateByPrimaryKeySelective(TServiceItemsHasTGuideOrderRequirement record);

    int updateByPrimaryKey(TServiceItemsHasTGuideOrderRequirement record);
}