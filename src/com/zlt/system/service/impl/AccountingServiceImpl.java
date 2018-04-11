package com.zlt.system.service.impl;

import java.util.List;

import com.zlt.system.dao.FinanceDao;
import com.zlt.system.dao.HotelDao;
import com.zlt.system.dao.OtherDao;
import com.zlt.system.dao.ReimnumtabDao;
import com.zlt.system.dao.StatusDao;
import com.zlt.system.dao.TrafficDao;
import com.zlt.system.dao.TravelDao;
import com.zlt.system.dao.impl.FinanceDaoImpl;
import com.zlt.system.dao.impl.HotelDaoImpl;
import com.zlt.system.dao.impl.OtherDaoImpl;
import com.zlt.system.dao.impl.ReimnumtabDaoImpl;
import com.zlt.system.dao.impl.StatusDaoImpl;
import com.zlt.system.dao.impl.TrafficDaoImpl;
import com.zlt.system.dao.impl.TravelDaoImpl;
import com.zlt.system.entity.Reimnumtab;
import com.zlt.system.entity.Status;

import com.zlt.system.service.AccountingService;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.HotelInfoVo;
import com.zlt.system.vo.OtherInfoVo;
import com.zlt.system.vo.TrafficInfoVo;
import com.zlt.system.vo.TravelInfoVo;
/**
 * 会计审计
 * @author 任义平
 *
 */
public class AccountingServiceImpl implements AccountingService{
	StatusDao statusdao=new StatusDaoImpl();
	TravelDao traveldao=new TravelDaoImpl();
	TrafficDao trafficdao=new TrafficDaoImpl();
	HotelDao hoteldao=new HotelDaoImpl();
	OtherDao otherdao=new OtherDaoImpl();
	ReimnumtabDao reimnumtabdao=new ReimnumtabDaoImpl();
	FinanceDao finance=new FinanceDaoImpl();
	/**
	 * 通过编号
	 */
	@Override
	public ApplyreimVo FindById(Reimnumtab reimnumtab) {
		return reimnumtabdao.FindById(reimnumtab);
	}
	/**
	 * 第一次审批通过，第二次未审批
	 */
	@Override
	public List<ApplyreimVo> Reimbursement() {
		// TODO Auto-generated method stub
		List<ApplyreimVo> list = statusdao.FindByStatus();
		return list;
	}
	/**
	 * 差旅详情
	 */
	@Override
	public TravelInfoVo ReimbursementTravel(String app_abb) {
		return traveldao.FindByType(app_abb);
		
	}
	/**
	 * 审批通过后更新状态和意见
	 */
	@Override
	public void UpdateState(Status status) {
		statusdao.UpdateStatus(status);
	}
	/**
	 * 驳回之后
	 */
	@Override
	public void InsertReson(Status status) {
		// TODO Auto-generated method stub
		statusdao.UpdateOpinion(status);
	}
	/**
	 * 交通详情
	 */
	@Override
	public TrafficInfoVo ReimbursementTraffic(String app_abb) {
		// TODO Auto-generated method stub
		return trafficdao.FindByType(app_abb);
	}
	/**
	 * 其他详情
	 */
	@Override
	public OtherInfoVo ReimbursementOther(String app_abb) {
		// TODO Auto-generated method stub
		return otherdao.FindByType(app_abb);
	}
	/**
	 * 住宿补助详情
	 */
	@Override
	public HotelInfoVo ReimbursementHotel(String app_abb) {
		// TODO Auto-generated method stub
		return hoteldao.FindByType(app_abb);
	}
	/**
	 * 用于付款
	 */
	@Override
	public void InsertFinance(ApplyreimVo apply) {
		// TODO Auto-generated method stub
		finance.FinanceAdd(apply);
	}
	
}
