package com.zlt.system.dao;

import java.util.List;
import com.zlt.system.entity.Employee;
import com.zlt.system.entity.Status;
import com.zlt.system.vo.StatusVO;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.StatusDetailVO;
import com.zlt.system.vo.Swarthy;

/**
*审批状态Dao类
*包含insert、selectAll、update四个方法接口
*@author xinzou
*@date 2018/1/22
*@version 1.0
*/

public interface StatusDao  extends CurrencyDao<Status>{

	/**
	 * 查询申请状态方法接口
	 * @param <T>
	 * @return 返回所有申请结果集
	 */
	public List<StatusVO> selectAll();
	
	/**
	 * 模糊查询方法接口
	 * @param 模糊查询字符串
	 * @return 模糊查询结果集
	 */
	public List<StatusVO> selectLike(String likeString);
	
	/**
	 * 查询详情方法接口
	 * @param 申请状态记录ID
	 * @return 申请状态对象
	 */
	public StatusDetailVO selectDetails(String app_abb);
	/**
	 * 同意的修改
	 * @param status
	 */
	public void UpdateStatus(Status status);
	/**
	 * @author 刘俊泽
	 * 审核通过
	 * @param status
	 */
	public void UPdateElse(Status status);
	
	public void UPdateboh(Status status);
	/**
	 * 驳回的修改
	 * @param status
	 */
	public void UpdateOpinion(Status status);
	/**
	 * 查询报销审批
	 * @param status
	 * @return
	 */
	public List<ApplyreimVo> FindByStatus();
	/**
	 * @author 刘俊泽
	 * @param status 申请审批页面查询全部
	 * @return
	 */
	public List<ApplyreimVo> FindByAll();
	/**
	 * 用于个人报表中的年报表的数据查询 报销单通过
	 * @author 晓煜
	 * @return vo对象实体，月，个数
	 * @param employee 员工类实体对象，具体信息 姓名
	 */
	List<Swarthy>StatusFindPass(Employee employee);
	/**
	 * 用于个人报表中的年报表的数据查询 ，未通过
	 * @author 晓煜
	 * @return vo对象实体，月，个数
	 * @param employee 员工类实体对象，具体信息 姓名
	 */
	List<Swarthy>StatusFindNotPassed(Employee employee);
	
}
