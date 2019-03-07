package cn.yzlsoft.mutualaidfunds.module.association.info.mapper;

import cn.yzlsoft.mutualaidfunds.module.api.entity.Increment1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @Date: 2019/03/07
* @Description: 
*/
@Repository
@Mapper
public interface Increment1Mapper {
    int deleteByPrimaryKey(Long incrementId);

    int insert(Increment1 record);

    int insertSelective(Increment1 record);

    Increment1 selectByPrimaryKey(Long incrementId);

    int updateByPrimaryKeySelective(Increment1 record);

    int updateByPrimaryKey(Increment1 record);
}