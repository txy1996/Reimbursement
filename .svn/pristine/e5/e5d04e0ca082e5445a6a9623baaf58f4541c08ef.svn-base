package com.zlt.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zlt.system.dao.StatusDao;
import com.zlt.system.dao.TravelDao;
import com.zlt.system.dao.impl.StatusDaoImpl;
import com.zlt.system.dao.impl.TravelDaoImpl;
import com.zlt.system.entity.Employee;
import com.zlt.system.service.APersonalReportService;
import com.zlt.system.vo.Report;
import com.zlt.system.vo.Swarthy;

/**
 * 个人报表的业务层实现类
 * @author 晓煜
 * @date2018年1月24日下午10:36:31
 * @version
 * @explain
 */
public class APersonalReportServiceImpl implements APersonalReportService{

	@Override
	public List<Report> APersonalReportServicePie(Employee employee) {
		// TODO Auto-generated method stub
		TravelDao travelDao= new TravelDaoImpl();
		ArrayList<Report>reports=(ArrayList<Report>) travelDao.TravelFindById(employee);
		return reports;
	}

	@Override
	public List<Swarthy> APersonalReportServiceCombination(Employee employee) {
		// TODO Auto-generated method stub
		StatusDao statusDao=new StatusDaoImpl();
		ArrayList<Swarthy>swarthies=new ArrayList<Swarthy>();
		swarthies=(ArrayList<Swarthy>) statusDao.StatusFindPass(employee);
		return swarthies;
	}

	@Override
	public List<Swarthy> APersonalReportServiceCombinationTwo(Employee employee) {
		// TODO Auto-generated method stub
		StatusDao statusDao=new StatusDaoImpl();
		ArrayList<Swarthy>swarthies=new ArrayList<Swarthy>();
		swarthies=(ArrayList<Swarthy>) statusDao.StatusFindNotPassed(employee);
		return swarthies;
	}

}
