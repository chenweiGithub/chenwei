package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TRole;
import com.bestedg.myTimesNz.db.tdb.entity.TRoleExample;
import java.util.List;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExample(TRoleExample example);

    TRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}