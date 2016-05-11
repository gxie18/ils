package unlcn.com.services;

import com.chinacreator.c2.dao.Dao;
import com.chinacreator.c2.dao.DaoFactory;
import com.chinacreator.c2.exception.C2RuntimeException;

import demo.user.User;

public class CUserService 
{
	public User save(User luser ) 
	{
		Dao<User> dao=DaoFactory.create(User.class);
		
		User ouser = new User();
		ouser.setVcuserno(luser.getVcuserno());
		
		//dao.getSession().
		ouser = dao.selectOne(ouser);//
		
		
		if ( ouser == null)
		{
			dao.insert(luser);
			return luser;
		}
		else
		{
			throw new RuntimeException("新增失败，已存在数据");
		}
		
		
	}
	
}
