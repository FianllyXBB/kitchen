package com.family.kitchen.back.user.service;

import java.io.IOException;

import com.family.kitchen.back.user.ao.BackUserAo;
import com.family.kitchen.back.user.web.vo.BackUserVo;
import com.family.kitchen.util.PageSet;

/**
 * 
 *<p>Title:BackUserService.java</p>
 * @Package com.family.kitchen.back.user.service
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月28日 下午5:12:01
 */
public interface BackUserService {

	public PageSet<BackUserAo> selectAll(BackUserVo backUserVo) throws IOException;
	
}
