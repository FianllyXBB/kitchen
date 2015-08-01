package com.family.kitchen.user.mapper;

import java.io.IOException;

import com.family.kitchen.user.ao.UserAo;
import com.family.kitchen.user.po.User;
import com.family.kitchen.user.web.vo.UserVo;

/**
 * 
 * <p>Title: 用户信息dao层接口</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年7月26日 下午8:50:12 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年7月26日 下午8:50:12  XBB  Create
 * </pre>
 *
 */
public interface UserMapper {

	public void insertSingleUser(User user) throws IOException; 
	
	public User selectUserByUsername(String username) throws IOException;
	
	public User selectUserByEmail(String email) throws IOException;
	
	public UserAo selectSingleUser(UserVo userVo) throws IOException;

}
