package com.zlt.system.service;

import java.util.List;
import com.zlt.system.entity.Status;
import com.zlt.system.vo.StatusDetailVO;
import com.zlt.system.vo.StatusVO;

/**
*审批状态业务类
*@author xinzou
*@date 2018/1/22
*/

public interface ApprovalStatusService {

	/**
	 * 查询申请状态方法接口
	 * @return
	 */
	public List<StatusVO> selectAll();
	
	/**
	 * 模糊查询方法接口
	 * @param likeString:模糊查询内容
	 * @return 查到的结果集
	 */
	public List<StatusVO> selectLike(String likeString);
	
	/**
	 * 查询详情方法接口
	 * @param appeoId 记录编号
	 * @return 申请记录状态对象
	 */
	public StatusDetailVO selectDetails(String app_abb);
}
