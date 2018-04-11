package com.zlt.system.service;

import java.sql.SQLException;
import java.util.List;

import com.zlt.system.vo.History;

/**
 * 已经审批通过或没通过的历史记录查询,对应的业务层
 * 
 * @author `'`灯半盏
 *
 */
public interface HistoryRecordService {
	/**
	 * 实现历史记录查询首页默认显示三个月内安正序排序的历史记录
	 * 
	 * @param userName
	 * @return List<History>当前用户上
	 * @throws SQLException
	 */
	public List<History> findDefault(String userName) throws SQLException;

	/**
	 * 根据用户输入的模糊字段进行模糊查询
	 * 
	 * @param 模糊字段Sring
	 * @throws SQLException
	 * @return相应的历史记录结果集:List<T>
	 */
	public List<History> findLike(String string, String thismon) throws SQLException;

	/**
	 * 界面下拉选项选择日期范围内查询 根据下拉选传入的Sting参数只可能是当月,三个月,半年,当年,更久对应的数字型字符串
	 * @param string 模糊字段
	 * @param 日期字符串thisTime
	 * @throws SQLException
	 * @return相应的历史记录结果集 :List<T>
	 */
	public List<History> findByDate(String thisTime) throws SQLException;

	/**
	 * 将已经在界面上的集合倒置
	 * 
	 * @return
	 */
	public List<History> replace();

	/**
	 * 
	 * @param page当前页
	 * @return 分页集合,导航条
	 */
	public Object[] pagingBar(int page);

}
