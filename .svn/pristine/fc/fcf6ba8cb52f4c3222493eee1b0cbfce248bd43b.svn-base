package com.zlt.system.service;
/**申请审批报销接口
 * @author 刘俊泽
 * 
 */
import java.util.List;

import com.zlt.system.entity.Reimnumtab;
import com.zlt.system.entity.Status;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.HotelInfoVo;
import com.zlt.system.vo.OtherInfoVo;
import com.zlt.system.vo.TrafficInfoVo;
import com.zlt.system.vo.TravelInfoVo;

public interface ApplyreimService {
	/**.
	 * 根据报销编号查询
	 */
	public List<ApplyreimVo> FindById(String app_abb,String emp_name,String reim_type);
	/**
	 * 报销信息全部显示
	 * @param <T>
	 * 
	 */
	public List<ApplyreimVo> Reimbursement();
	/**
	 * 查看报销的详细信息
	 * @return详情
	 */

	
	/**
	 * 审批通过后更新状态
	 * @param status状态
	 */
	public void UpdateState(Status status);
	/**
	 * @author 刘俊泽
	 * 提交驳回原因改变状态
	 * @param status原因
	 */
	public void InsertReson(Status status);
	/**
	 * @author 刘俊泽
	 * 查询报销人
	 * @param emp_name
	 * @return
	 */
	public ApplyreimVo FindByName(String id);
	/**
	 * 查看差旅报销的详细信息
	 * @return差旅
	 */
	public TravelInfoVo ReimbursementTravel(String app_abb);
	/**
	 * 交通详情
	 * @param app_abb
	 * @return交通
	 */
	public TrafficInfoVo ReimbursementTraffic(String app_abb);
	/**
	 * 其他详情
	 * @param app_abb
	 * @return其他类型
	 */
	public OtherInfoVo ReimbursementOther(String app_abb);
	/**
	 * 住宿补助详情
	 * @param app_abb
	 * @return住宿补助
	 */
	public HotelInfoVo ReimbursementHotel(String app_abb);
}
