package com.zlt.system.dao;

import java.sql.SQLException;
import java.util.List;

import com.zlt.system.entity.Other;
import com.zlt.system.vo.History;
import com.zlt.system.vo.OtherInfoVo;

/**
 * 调用其他报销类型表信息的接口
 * 
 * @author 米邓勇
 *
 */
public interface OtherDao extends CurrencyDao<Other> {
	/**
	 * 传入用户姓名储存为当前服务对象
	 * 
	 * @param userName
	 */
	public void currentUser(String userName);

	/**
	 * 根据用户输入的模糊字段进行模糊查询
	 * 
	 * @param 模糊字段string
	 * @param flag
	 *            用于判断排版正序和倒序的参数true为正序
	 * @throws SQLException
	 * @return相应的历史记录结果集:List<T>
	 */
	public List<History> findLike(String string, String thismon) throws SQLException;

	/**
	 * 界面下拉选项选择日期范围内查询 根据下拉选传入的Sting参数只可能是当月,三个月,半年,当年,更久对应的数字字符串
	 * 
	 * @param thisTime日期字符串
	 * @param flag
	 *            用于判断排版正序和倒序的参数true为正序
	 * @throws SQLException
	 * @return相应的历史记录结果集 :List<T>
	 */
	public List<History> findByDate(String thisTime) throws SQLException;

	/**
	 * 用于其他类型报销详情查询
	 * 
	 * @author 任义平
	 * @param app_abb
	 * @param type
	 * @return
	 */
	public OtherInfoVo FindByType(String app_abb);

	/**
	 * 其他类型查询
	 * 
	 * @author 刘俊泽
	 * @param app_abb
	 * @param type
	 * @return
	 */
	public OtherInfoVo FinByElse(String app_abb);
}
