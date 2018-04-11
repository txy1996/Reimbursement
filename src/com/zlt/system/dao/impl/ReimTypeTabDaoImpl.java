package com.zlt.system.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zlt.system.dao.ReimTypeTabDao;
import com.zlt.system.entity.Finance;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.util.DBUtil;
import com.zlt.system.vo.MainVo;

/**
 * 调用报销类型表信息的实现类
 * @author 米邓勇
 *
 */
public class ReimTypeTabDaoImpl extends CurrencyDaoImpl<ReimTypeTab> implements ReimTypeTabDao{
	/**
	 * 用于财务表修改不同类型，显示不同内容
	 * @author 冯杨
	 * @param  传入app_abb报销编号参数
	 * @return 返回一个查询到的集合
	 */
	@Override
	public List<Finance> FindByApp_abb(String app_abb) {
		// TODO Auto-generated method stub
		List<Finance> finance = new ArrayList<>();
		String sql = "SELECT * FROM finance WHERE app_abb LIKE ?";		
		try {
			finance = DBUtil.getQueryRunner().query(sql, new BeanListHandler<Finance>(Finance.class),"%"+app_abb+"%");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finance;
	}

	/**
	 * 用于查询所有报销类型
	 * @author 冯杨
	 * @param  
	 * @return 返回一个查询到的集合
	 */
	@Override
	public List<ReimTypeTab> FindByAll() {
		// TODO Auto-generated method stub
		List<ReimTypeTab> finance = null;
		String sql="SELECT reim_type FROM reimtypetab";
		try {
			finance=DBUtil.getQueryRunner().query(sql, new BeanListHandler<ReimTypeTab>(ReimTypeTab.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finance;
	}

	
	/**
	 * 根据名字查询登录人的基本信息
	 * 登录后主页显示登录人信息
	 */
	@Override
	public List<MainVo> findByLine(String emp_name) {
		// TODO Auto-generated method stub
		List<MainVo> aaa=null;
		String sql="SELECT emp.emp_id,emp.`emp_name` ,emp.`emp_sex`,"
				+" department.`department_name`,posi.`position_name`,emp.`emp_tel` "
				+" FROM emp,posi,department "
				+" WHERE emp.`post_id`=posi.`position_id` "
				+" AND posi.`department_id`=department.`department_id` AND emp.`emp_name`=?";
		try {
			aaa=DBUtil.getQueryRunner().query(sql, new BeanListHandler<MainVo>(MainVo.class),emp_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aaa;
	}

}
