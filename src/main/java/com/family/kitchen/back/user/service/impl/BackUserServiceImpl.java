package com.family.kitchen.back.user.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.back.user.ao.BackUserAo;
import com.family.kitchen.back.user.mapper.BackUserMapper;
import com.family.kitchen.back.user.service.BackUserService;
import com.family.kitchen.back.user.web.vo.BackUserVo;
import com.family.kitchen.util.PageSet;

/**
 * 
 *<p>Title:BackUserServiceImpl.java</p>
 * @Package com.family.kitchen.back.user.service.impl
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月28日 下午5:13:45
 */
@Service("backUserService")
public class BackUserServiceImpl implements BackUserService {

	@Autowired
	private BackUserMapper backUserMapper;
	
	@Override
	public PageSet<BackUserAo> selectAll(BackUserVo backUserVo) throws IOException {
		PageSet<BackUserAo> pageData = new PageSet<BackUserAo>();
		pageData.setPagesize(backUserVo.getPagesize());
		Integer totalRows = backUserMapper.selectCount(backUserVo);
		pageData.setTotalPageNum(totalRows%backUserVo.getPagesize()==0?totalRows/backUserVo.getPagesize():totalRows/backUserVo.getPagesize()+1);
		pageData.setPageData(backUserMapper.selectAll(backUserVo));
		return pageData;
	}

}
