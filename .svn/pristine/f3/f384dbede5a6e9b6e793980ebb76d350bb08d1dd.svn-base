package com.zlt.system.service;

import java.util.List;

import com.zlt.system.entity.Finance;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.vo.MainVo;

/**
 * 此接口是用于对财务表选择报销不同类型的
 * @author 冯杨
 * @date 2018年1月24日18:45
 * @explain 此接口是用于对财务表选择报销不同类型的
 */
public interface ReimnumtabService {
	/**
	 * 根据报销单号查询信息
	 * @param app_abb
	 * @return 一个集合
	 */
	List<Finance> FindByApp_abb(String app_abb);
	
	/**
	 * 查询所有报销类型
	 * @return 一个集合
	 */
	List<ReimTypeTab> FindAll();
	
	/**
	 * 根据名字查询登录人信息
	 * @param emp_name
	 * @return 一个集合
	 */
	List<MainVo> FindByLine(String emp_name);
}
