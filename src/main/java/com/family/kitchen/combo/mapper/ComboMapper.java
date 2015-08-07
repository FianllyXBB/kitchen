package com.family.kitchen.combo.mapper;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.po.Combo;
import com.family.kitchen.combo.web.vo.ComboVo;

/**
 * 
 * <p>Title: 基本套餐DAO接口</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年8月7日 上午9:22:16 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年8月7日 上午9:22:16  XBB  Create
 * </pre>
 *
 */
public interface ComboMapper {

	public List<ComboAo> selectAll(ComboVo comboVo) throws IOException;
	
	public void insertComboList(List<Combo> list) throws IOException;

	public Integer selectCount() throws IOException;
}
