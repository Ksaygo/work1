package cn.sn.mapper;

import cn.sn.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 十年
 * @since 2020-03-20
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
