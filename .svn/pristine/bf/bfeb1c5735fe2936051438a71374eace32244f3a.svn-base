package com.zlt.system.service.impl;

import java.util.List;

import com.zlt.system.dao.DepartmentDao;
import com.zlt.system.dao.PisitionDao;
import com.zlt.system.dao.ReimTypeTabDao;
import com.zlt.system.dao.ReimnumtabDao;
import com.zlt.system.dao.impl.DepartmentDaoImpl;
import com.zlt.system.dao.impl.PositionDaoImpl;
import com.zlt.system.dao.impl.ReimTypeTabDaoImpl;
import com.zlt.system.dao.impl.ReimnumtabDaoImpl;
import com.zlt.system.entity.Department;
import com.zlt.system.entity.Position;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.service.ReportFormService;
import com.zlt.system.vo.CompanyInfoVo;
import com.zlt.system.vo.DepartNameVo;
import com.zlt.system.vo.DepartmentInfoVo;
import com.zlt.system.vo.GetTimeVo;

public class ReportFormServiceImpl implements ReportFormService{
	ReimnumtabDao rd = new ReimnumtabDaoImpl();
	DepartmentDao dd = new DepartmentDaoImpl();
	ReimTypeTabDao rt = new ReimTypeTabDaoImpl();
	@Override
	public List<GetTimeVo> findTime() {
		return rd.findTime();
	}

	@Override
	public List<DepartmentInfoVo> findDepartmentInfo(int year,String depart) {
		return rd.findDepartmentInfo(year,depart);
	}

	@Override
	public List<CompanyInfoVo> findCompanyInfo(int year) {
		return rd.findCompanyInfo(year);
	}

	@Override
	public List<Department> findDepartmentAll() {
		// TODO Auto-generated method stub
		return dd.findall();
	}

	@Override
	public List<ReimTypeTab> findReimTypeTabAll() {
		// TODO Auto-generated method stub
		return rt.findall();
	}

	@Override
	public DepartNameVo findDepart(String name) {
		// TODO Auto-generated method stub
		return rd.findDepart(name);
	}

}
