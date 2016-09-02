package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TPermission;
import com.bestedg.myTimesNz.db.tdb.entity.TPermissionExample;
import java.util.List;

public interface TPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    List<TPermission> selectByExample(TPermissionExample example);

    TPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);
}