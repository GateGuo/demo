package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.UserInfoDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author changyuan.guo@hand-china.com
 * @Title UserInfoMapper
 * @Description TODO
 * @date 2019/03/12
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoDO> {
    int updateBatch(List<UserInfoDO> list);

    int batchInsert(@Param("list") List<UserInfoDO> list);

    int insertOrUpdate(UserInfoDO record);

    int insertOrUpdateSelective(UserInfoDO record);
}