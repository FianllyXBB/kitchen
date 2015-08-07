package com.family.kitchen.combo.service;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.po.Combo;

/**
 * 
 * <p>Title: Combo service 接口</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年8月7日 上午9:24:25 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年8月7日 上午9:24:25  XBB  Create
 * </pre>
 *
 */
public interface ComboService {

	public List<ComboAo> selectAll(Integer pagenumber, Integer pagesize, String ordercolumn, String ordermethod) throws IOException;

	public void insertComboList(List<Combo> list) throws IOException;
	
	public Integer selectCount() throws IOException;
}
