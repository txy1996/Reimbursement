package com.zlt.system.service;

import java.util.List;

import com.zlt.system.entity.Department;
import com.zlt.system.entity.Position;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.vo.CompanyInfoVo;
import com.zlt.system.vo.DepartNameVo;
import com.zlt.system.vo.DepartmentInfoVo;
import com.zlt.system.vo.GetTimeVo;

public interface ReportFormService {
	/**
	 * 返回拥有数据的所有年份
	 * @2018年1月26日
	 * @List<GetTimeVo>
	 * @findTime
	 * @author 米邓勇
	 */
	public List<GetTimeVo> findTime();
	/**
	 * 返回指定年份的部门报销数据
	 * @2018年1月26日
	 * @List<DepartmentInfoVo>
	 * @findDepartmentInfo
	 * @author 米邓勇
	 */
	public List<DepartmentInfoVo> findDepartmentInfo(int year,String depart);
	/**
	 * 返回指定年份的公司报销信息
	 * @2018年1月26日
	 * @List<CompanyInfoVo>
	 * @findCompanyInfo
	 * @author 米邓勇
	 */
	public List<CompanyInfoVo> findCompanyInfo(int year);
	/**
	 * 获取公司的部门信息
	 * @2018年1月26日
	 * @List<Department>
	 * @findall
	 */
	public List<Department> findDepartmentAll();
	/**
	 * 查询所有报销类型信息
	 * @2018年1月26日
	 * @List<ReimTypeTab>
	 * @findReimTypeTabAll
	 */
	public List<ReimTypeTab> findReimTypeTabAll();
	/**
	 * 查询指定员工部门信息
	 * @2018年1月26日
	 * DepartNameVo
	 * @findDepart
	 */
	public DepartNameVo findDepart(String name);
}
