package com.zlt.system.service.impl;

import java.util.List;

import com.zlt.system.dao.impl.ReimTypeTabDaoImpl;
import com.zlt.system.entity.Finance;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.service.ReimnumtabService;
import com.zlt.system.vo.MainVo;

/**
 * 实现对财务表选择报销不同类型的查询
 * @author 冯杨
 * @date 2018年1月24日18:45
 * @explain 此方法实现ReimnumtabService接口，实现对财务表选择报销不同类型的查询
 */
public class ReimnumrabServiceImpl implements ReimnumtabService{
	private ReimTypeTabDaoImpl reimtypetabDao=new ReimTypeTabDaoImpl();
	@Override
	
	/**
	 * @param 传入报销编号
	 * @return 返回查询到的对象集合
	 */
	public List<Finance> FindByApp_abb(String app_abb) {
		// TODO Auto-generated method stub
		List<Finance> a=reimtypetabDao.FindByApp_abb(app_abb);
		return a;
			
	}	
	/**
	 * 查询所有报销类型
	 * 返回所有报销类型集合
	 * 
	 */
	@Override
	public List<ReimTypeTab> FindAll() {
		// TODO Auto-generated method stub
		List<ReimTypeTab> a=reimtypetabDao.FindByAll();
		return a;
	}
	
	/**
	 * 
	 * 根据名字查询登录人信息
	 * 返回集合
	 */
	@Override
	public List<MainVo> FindByLine(String emp_name) {
		// TODO Auto-generated method stub
		List<MainVo> a=reimtypetabDao.findByLine(emp_name);
		return a;
	}

}
