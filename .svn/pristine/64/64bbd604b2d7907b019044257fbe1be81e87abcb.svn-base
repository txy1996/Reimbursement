package com.zlt.system.service.impl;
/**
 * @author 刘俊泽 报销申请实现类
 */
import java.util.List;

import com.zlt.system.dao.EmployeeDao;
import com.zlt.system.dao.HotelDao;
import com.zlt.system.dao.OtherDao;
import com.zlt.system.dao.ReimnumtabDao;
import com.zlt.system.dao.StatusDao;
import com.zlt.system.dao.TrafficDao;
import com.zlt.system.dao.TravelDao;
import com.zlt.system.dao.impl.EmployeeDaoImpl;
import com.zlt.system.dao.impl.HotelDaoImpl;
import com.zlt.system.dao.impl.OtherDaoImpl;
import com.zlt.system.dao.impl.ReimnumtabDaoImpl;
import com.zlt.system.dao.impl.StatusDaoImpl;
import com.zlt.system.dao.impl.TrafficDaoImpl;
import com.zlt.system.dao.impl.TravelDaoImpl;
import com.zlt.system.entity.Reimnumtab;
import com.zlt.system.entity.Status;
import com.zlt.system.service.ApplyreimService;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.HotelInfoVo;
import com.zlt.system.vo.OtherInfoVo;
import com.zlt.system.vo.TrafficInfoVo;
import com.zlt.system.vo.TravelInfoVo;

public class ApplyreimServiceImpl implements ApplyreimService{
	StatusDao statudao = new StatusDaoImpl();
	EmployeeDao emp=new EmployeeDaoImpl();
	

	@Override
	public List<ApplyreimVo> Reimbursement() {
		// TODO Auto-generated method stub
		return statudao.FindByAll();///查询全部
	}



/**
 * @author 刘俊泽
 * 审批状态
 */
	@Override
	public void UpdateState(Status status) {
		// TODO Auto-generated method stub
		statudao.UPdateElse(status);
	}


/**
 * @author 刘俊泽
 *提交驳回改变状态
 */
	@Override
	public void InsertReson(Status status) {
		// TODO Auto-generated method stub
		statudao.UPdateboh(status);
	}






/**
 * @author 刘俊泽
 * 查询ID
 */
@Override
public List<ApplyreimVo> FindById(String app_abb,String emp_name,String reim_type) {
	// TODO Auto-generated method stub
	EmployeeDaoImpl a = new EmployeeDaoImpl();
   List<ApplyreimVo>c =	a.AppByid(app_abb, emp_name, reim_type);
return c;
}






/**
 * 查询报销人
 */
@Override
public ApplyreimVo FindByName(String id) {
	// TODO Auto-generated method stub
	return emp.AppByApp_abb(id);
}



@Override
public TravelInfoVo ReimbursementTravel(String app_abb) {
	// TODO Auto-generated method stub
	TravelDao traveldao=new TravelDaoImpl();
	return traveldao.FindByType(app_abb);
}



@Override
public TrafficInfoVo ReimbursementTraffic(String app_abb) {
	// TODO Auto-generated method stub
	TrafficDao trafficdao=new TrafficDaoImpl();
	return trafficdao.FindByType(app_abb);
	
}



@Override
public OtherInfoVo ReimbursementOther(String app_abb) {
	// TODO Auto-generated method stub
	OtherDao otherdao=new OtherDaoImpl();
	return otherdao.FindByType(app_abb);
}



@Override
public HotelInfoVo ReimbursementHotel(String app_abb) {
	// TODO Auto-generated method stub
	HotelDao hoteldao=new HotelDaoImpl();
	return hoteldao.FindByType(app_abb);

}






	



	

	

}
