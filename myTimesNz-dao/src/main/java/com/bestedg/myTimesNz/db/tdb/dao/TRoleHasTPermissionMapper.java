package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TRoleHasTPermission;
import com.bestedg.myTimesNz.db.tdb.entity.TRoleHasTPermissionExample;
import com.bestedg.myTimesNz.db.tdb.entity.TRoleHasTPermissionKey;
import java.util.List;

public interface TRoleHasTPermissionMapper {
    int deleteByPrimaryKey(TRoleHasTPermissionKey key);

    int insert(TRoleHasTPermission record);

    int insertSelective(TRoleHasTPermission record);

    List<TRoleHasTPermission> selectByExample(TRoleHasTPermissionExample example);

    TRoleHasTPermission selectByPrimaryKey(TRoleHasTPermissionKey key);

    int updateByPrimaryKeySelective(TRoleHasTPermission record);

    int updateByPrimaryKey(TRoleHasTPermission record);
}