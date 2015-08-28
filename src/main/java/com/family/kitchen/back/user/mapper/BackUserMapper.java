package com.family.kitchen.back.user.mapper;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.back.user.ao.BackUserAo;
import com.family.kitchen.back.user.web.vo.BackUserVo;

/**
 * 
 *<p>Title:BackUserMapper.java</p>
 * @Package com.family.kitchen.back.user.mapper
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月28日 下午4:51:14
 */
public interface BackUserMapper {

	public List<BackUserAo> selectAll(BackUserVo backUserVo) throws IOException;
	
	public Integer selectCount(BackUserVo backUserVo) throws IOException;
}
