package com.zlt.system.dao;

import java.util.List;

import com.zlt.system.entity.Finance;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.entity.Traffic;
import com.zlt.system.vo.Line;
import com.zlt.system.vo.MainVo;

/**
 * 调用报销类型数据的接口
 * @author 米邓勇
 *
 */
public interface ReimTypeTabDao  extends CurrencyDao<ReimTypeTab>{
	
	/**
	  * 此接口用于根据报销单号查询所有报销类型
	  * @author 冯杨
	  * @param app_abb
	  * @return 返回报销类型
	  */
	 List<Finance> FindByApp_abb(String app_abb);
	 
	 /**
	  * 此接口用于根据报销单号查询所有报销类型
	  * @author 冯杨
	  * @param app_abb
	  * @return 返回报销类型
	  */
	 List<ReimTypeTab> FindByAll();
	 
	 /**
	  * 此接口用于根据报登录名查询姓名，职位，部门，性别，电话
	  * @author 冯杨
	  * @param app_abb
	  * @return 返回MainVoJ集合
	  */
	 List<MainVo> findByLine(String emp_name);
}
