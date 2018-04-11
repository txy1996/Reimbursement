package com.zlt.system.service;

import java.util.List;

import com.zlt.system.entity.Employee;
import com.zlt.system.vo.Report;
import com.zlt.system.vo.Swarthy;

/**
 * 用于个人报表的业务层操作
 * @author 晓煜
 * @date2018年1月24日下午9:34:49
 * @version
 * @explain
 */
public interface APersonalReportService {
	/**
	 * 用于业务层类型饼状图的数据传输
	 * @param employee 员工类实体：具体信息 姓名
	 * @return vo类对象，类型和数量
	 */
	 List<Report> APersonalReportServicePie(Employee employee);
	 /**
	  * 用于业务层年报表组合图的数据传输
	  * @param employee 员工类实体：具体信息 姓名
	  * @return  vo类对象，月份和数量 通过
	  */
	 List<Swarthy>APersonalReportServiceCombination(Employee employee);
	 /**
	  * 用于业务层年报表组合图的数据传输
	  * @param employee 员工类实体：具体信息 姓名
	  * @return  vo类对象，月份和数量 未通过
	  */
	 List<Swarthy> APersonalReportServiceCombinationTwo(Employee employee);
}
