package org.zxy.xiaohashu.auth;

import com.quanxiaoha.framework.common.util.JsonUtils;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.zxy.xiaohashu.auth.domain.dataobject.UserDO;
import org.zxy.xiaohashu.auth.domain.mapper.UserDOMapper;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class XiaohashuAuthApplicationTests {

    @Resource
    private UserDOMapper userDOMapper;

	// 省略...

    /**
     * 查询数据
     */
    @Test
    void testSelect() {
    	// 查询主键 ID 为 4 的记录
        UserDO userDO = userDOMapper.selectByPrimaryKey(1L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }
    @Test
    void testUpdate() {
        UserDO userDO = UserDO.builder()
                .id(1L)
                .username("犬小哈教程")
                .updateTime(LocalDateTime.now())
                .build();

		// 根据主键 ID 更新记录
        userDOMapper.updateByPrimaryKey(userDO);
    }
     /**
     * 删除数据
     */
    @Test
    void testDelete() {
    	// 删除主键 ID 为 4 的记录
        userDOMapper.deleteByPrimaryKey(1L);
    }
}
