package com.zlt.system.dao.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import com.zlt.system.dao.StatusDao;
import com.zlt.system.entity.Employee;
import com.zlt.system.entity.Status;
import com.zlt.system.util.DBUtil;
import com.zlt.system.vo.StatusVO;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.StatusDetailVO;
import com.zlt.system.vo.Swarthy;

/**
 * ApprovalStatusDao实现类 包含增、改、查方法
 * 
 * @author xinzou
 * @date 2018/1/22
 * @version 1.0
 */

public class StatusDaoImpl extends CurrencyDaoImpl<Status> implements StatusDao {

	/**
	 * 查询申请状态方法实现 return:返回结果集
	 * @author xinzou
	 * @param <T>
	 */
	public List<StatusVO> selectAll() {
		String sql = "SELECT travel.app_abb,travel.emp_name,travel.travel_time,reimtypetab.reim_type,travel.travel_money,status.status_result"
+" FROM travel JOIN reimtypetab ON travel.reim_id = reimtypetab.reim_id JOIN STATUS ON travel.app_abb = status.app_abb"
+" UNION ALL"
+" SELECT traffic.app_abb,traffic.emp_name,traffic.traffic_time,reimtypetab.reim_type,traffic.traffic_money,status.status_result"
+" FROM traffic JOIN reimtypetab ON traffic.reim_id = reimtypetab.reim_id JOIN STATUS ON traffic.app_abb = status.app_abb"
+" UNION ALL"
+" SELECT hotel.app_abb,hotel.emp_name,hotel.hotel_time,reimtypetab.reim_type,hotel.hotel_quarterage,status.status_result"
+" FROM hotel JOIN reimtypetab ON hotel.reim_id = reimtypetab.reim_id JOIN STATUS ON hotel.app_abb = status.app_abb"
+" UNION ALL"
+" SELECT other.app_abb,other.emp_name,other.other_time,reimtypetab.reim_type,other.other_money,status.status_result"
+" FROM other JOIN reimtypetab ON other.reim_id = reimtypetab.reim_id JOIN STATUS ON other.app_abb = status.app_abb";
		List<StatusVO> StatusVOs=new ArrayList<StatusVO>();
	
		try {
			StatusVOs = DBUtil.getQueryRunner().query(sql,  new BeanListHandler<StatusVO>(StatusVO.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return StatusVOs;
	}

	/**
	 * 模糊查询方法实现
	 * @author xinzou
	 * @return 模糊查询结果集
	 */

	public List<StatusVO> selectLike(String likeString) {
		String sql="SELECT * FROM (SELECT travel.app_abb,travel.emp_name,travel.travel_time,reimtypetab.reim_type,travel.travel_money,status.status_result"
				+" FROM travel JOIN reimtypetab ON travel.reim_id = reimtypetab.reim_id JOIN STATUS ON travel.app_abb = status.app_abb"
				+" UNION ALL"
				+" SELECT traffic.app_abb,traffic.emp_name,traffic.traffic_time,reimtypetab.reim_type,traffic.traffic_money,status.status_result"
				+" FROM traffic JOIN reimtypetab ON traffic.reim_id = reimtypetab.reim_id JOIN STATUS ON traffic.app_abb = status.app_abb"
				+" UNION ALL"
				+" SELECT hotel.app_abb,hotel.emp_name,hotel.hotel_time,reimtypetab.reim_type,hotel.hotel_quarterage,status.status_result"
				+" FROM hotel JOIN reimtypetab ON hotel.reim_id = reimtypetab.reim_id JOIN STATUS ON hotel.app_abb = status.app_abb"
				+" UNION ALL"
				+" SELECT other.app_abb,other.emp_name,other.other_time,reimtypetab.reim_type,other.other_money,status.status_result"
				+" FROM other JOIN reimtypetab ON other.reim_id = reimtypetab.reim_id JOIN STATUS ON other.app_abb = status.app_abb) a"
				+" WHERE a.app_abb LIKE BINARY '%"+ likeString +"%' OR a.emp_name LIKE BINARY '%"+ likeString +"%' OR a.travel_time LIKE BINARY '%"+ likeString +"%' OR a.reim_type LIKE BINARY '%"
				+ likeString +"%' OR travel_money LIKE BINARY '%"+ likeString +"%' OR status_result LIKE BINARY '%"+ likeString +"%'";
		List<StatusVO> statusVOs=new ArrayList<StatusVO>();
		try {
			statusVOs= DBUtil.getQueryRunner().query(sql,  new BeanListHandler<StatusVO>(StatusVO.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statusVOs;
	}

	/**
	 * 查看详情方法接口实现
	 * 查看详情方法 return:返回申请状态对象
	 * @author xinzou
	 */
	@Override
	public StatusDetailVO selectDetails(String app_abb) {
		String sql = null;
		if (app_abb.contains("ZS")) {
			sql = "SELECT * FROM hotel JOIN STATUS ON hotel.app_abb = status.app_abb JOIN reimtypetab ON hotel.reim_id = reimtypetab.reim_id WHERE status.app_abb = ?";
		} else if (app_abb.contains("CL")) {
			sql = "SELECT * FROM travel JOIN STATUS ON travel.app_abb = status.app_abb JOIN reimtypetab ON travel.reim_id = reimtypetab.reim_id WHERE status.app_abb = ?";
		} else if (app_abb.contains("JT")) {
			sql = "SELECT * FROM traffic JOIN STATUS ON traffic.app_abb = status.app_abb JOIN reimtypetab ON traffic.reim_id = reimtypetab.reim_id WHERE status.app_abb = ?";
		} else {
			sql = "SELECT * FROM other JOIN STATUS ON other.app_abb = status.app_abb JOIN reimtypetab ON other.reim_id = reimtypetab.reim_id WHERE status.app_abb = ?";
		}
		List<StatusDetailVO> statusDetailVOs=new ArrayList<StatusDetailVO>();
		StatusDetailVO statusDetailVO = null;
		try {
			statusDetailVOs = DBUtil.getQueryRunner().query(sql,  new BeanListHandler<StatusDetailVO>(StatusDetailVO.class),app_abb);
			statusDetailVO = statusDetailVOs.get(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statusDetailVO;
	}

	/**
	 * 报销审批驳回之后的意见修改
	 */
	@Override
	public void UpdateOpinion(Status status) {
		String sql = "UPDATE STATUS SET status2_opinion=?,status2='未通过',status_result='未通过',status2_time=? WHERE app_abb=?";
		QueryRunner runner = new QueryRunner();
		try {
			runner.update(DBUtil.getConnection(), sql, status.getStatus2_opinion(), status.getStatus2_time(),status.getApp_abb());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pre, rs);
		}
	}

	/**
	 * 审批通过后状态的改变和意见改变
	 */
	@Override
	public void UpdateStatus(Status status) {

		String sql = "UPDATE STATUS SET status_result='通过',status2='通过',status2_time=?,status2_opinion=? WHERE app_abb=?";
		QueryRunner runner = new QueryRunner();
		try {
			runner.update(DBUtil.getConnection(), sql, status.getStatus2_time(),status.getStatus2_opinion(),status.getApp_abb());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pre, rs);
		}
	}

	/**
	 * 第一次审批通过，第二次没有审批的
	 * 
	 * @author 任义平
	 */
	@Override
	public List<ApplyreimVo> FindByStatus() {
		String sql = "SELECT status1,status2,a.reim_type,a.emp_name,a.department_name,a.app_abb,a.money\r\n" + 
				"FROM STATUS,\r\n" + 
				"(SELECT reim_type,emp_name,department_name,app_abb,hotel_quarterage AS money FROM hotel,reimtypetab WHERE hotel.`reim_id`=reimtypetab.`reim_id`\r\n" + 
				"UNION	\r\n" + 
				"SELECT reim_type,emp_name,department_name,app_abb,other_money AS money FROM other ,reimtypetab WHERE other.`reim_id`=reimtypetab.`reim_id`\r\n" + 
				"UNION\r\n" + 
				"SELECT reim_type,emp_name,department_name,app_abb,traffic_money AS money FROM traffic ,reimtypetab WHERE traffic.`reim_id`=reimtypetab.`reim_id`\r\n" + 
				"UNION\r\n" + 
				"SELECT reim_type,emp_name,department_name,app_abb,travel_money AS money FROM travel ,reimtypetab WHERE travel.`reim_id`=reimtypetab.`reim_id`) a \r\n" + 
				"WHERE  status.`app_abb` IN (a.app_abb) AND status1='审核通过' AND status2='审核中'";
		List<ApplyreimVo> list = new ArrayList<ApplyreimVo>();
		try {
			list = DBUtil.getQueryRunner().query(sql, new BeanListHandler<ApplyreimVo>(ApplyreimVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pre, rs);
		}
		return list;
	}


 

	

/**
 * @author 刘俊泽
 * 查询全部数据
 */
	@Override
	public List<ApplyreimVo> FindByAll() {
		String sql = " SELECT status1,a.reim_type,a.emp_name,a.department_name,a.app_abb,a.money FROM STATUS ,"
					+" (SELECT reim_type,emp_name,department_name,app_abb,hotel_quarterage AS money FROM hotel,reimtypetab WHERE hotel.`reim_id`=reimtypetab.`reim_id` "
					+" UNION"	
					+" SELECT reim_type,emp_name,department_name,app_abb,other_money AS money FROM other,reimtypetab WHERE other.`reim_id`=reimtypetab.`reim_id` "
					+" UNION"
					+" SELECT reim_type,emp_name,department_name,app_abb,traffic_money AS money FROM traffic,reimtypetab WHERE traffic.`reim_id`=reimtypetab.`reim_id` "
					+" UNION"
					+" SELECT reim_type,emp_name,department_name,app_abb,travel_money AS money FROM travel,reimtypetab WHERE travel.`reim_id`=reimtypetab.`reim_id`) a  " 
					+" WHERE  status.`app_abb` IN (a.app_abb) AND status1='审核中'";
		List<ApplyreimVo> list = new ArrayList<ApplyreimVo>();
		try {
			list = DBUtil.getQueryRunner().query(sql, new BeanListHandler<ApplyreimVo>(ApplyreimVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}

	/**
	 * @author 晓煜
	 */
	@Override
	public List<Swarthy> StatusFindPass(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "SELECT t.month AS MONTH,COUNT(t.month) AS number ,t.state AS state "
							+"  FROM  "
							+"  (SELECT DATE_FORMAT(c.time,'%Y-%m') AS MONTH ,status.`status_result` AS state  "
							+"  FROM   "
							+"  STATUS ,(SELECT DATE_FORMAT(CURDATE(), '%Y-%m-%D')AS `month`)a,  "
							+"  (SELECT DATE_FORMAT((CURDATE() - INTERVAL 11 MONTH), '%Y-%m-%D') AS `end`)b,   "
							+"  (SELECT app_abb,travel.`travel_time` AS TIME FROM travel WHERE travel.`emp_name`= ? "
							+"  UNION  "
							+"  SELECT app_abb,traffic.`traffic_time` AS TIME FROM traffic WHERE traffic.`emp_name`= ? "
							+"  UNION   "
							+"  SELECT app_abb,other.`other_time` AS TIME FROM other WHERE other.`emp_name`= ? "
							+"  UNION  "
							+"  SELECT app_abb,hotel.`hotel_time` AS TIME FROM  hotel WHERE hotel.`emp_name`= ? )c  "
							+"  WHERE  c.time  BETWEEN b.end AND a.month  "
							+"  AND c.app_abb IN(status.`app_abb`)) t  "
							 +"  GROUP BY t.month ,t.state";
		List<Swarthy> swarthy = new ArrayList<Swarthy>();
		try {
			swarthy = DBUtil.getQueryRunner().query(sql, 
					new BeanListHandler<Swarthy>(Swarthy.class),
					employee.getEmp_name(),employee.getEmp_name(),
					employee.getEmp_name(),employee.getEmp_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return swarthy;
	}

	/**
	 * @author 晓煜
	 */
	@Override
	public List<Swarthy> StatusFindNotPassed(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "SELECT t.month AS MONTH,COUNT(t.month) AS number "
							+" FROM "
							+" (SELECT DATE_FORMAT(status.`status2_time`,'%Y-%m') AS MONTH "
							+" FROM  "
							+" STATUS ,(SELECT DATE_FORMAT(CURDATE(), '%Y-%m-%D')AS `month`)a, "
							+" (SELECT DATE_FORMAT((CURDATE() - INTERVAL 11 MONTH), '%Y-%m-%D') AS `end`)b, "
							+" (SELECT app_abb FROM travel WHERE travel.`emp_name`=? "
							+" UNION "
							+" SELECT app_abb FROM traffic WHERE traffic.`emp_name`=?  "
							+" UNION  "
							+" SELECT app_abb FROM other WHERE other.`emp_name`=?  "
							+" UNION "
							+" SELECT app_abb FROM  hotel WHERE hotel.`emp_name`=? )c "
							+" WHERE  status.`status2_time`  BETWEEN b.end AND a.month "
							+" AND status.`status_result` <> '通过' "
							+" AND c.app_abb IN(status.`app_abb`)) t "
							+" GROUP BY t.month";
		List<Swarthy> swarthy = new ArrayList<Swarthy>();
		try {
			swarthy = DBUtil.getQueryRunner().query(sql, 
					new BeanListHandler<Swarthy>(Swarthy.class),
					employee.getEmp_name(),employee.getEmp_name(),
					employee.getEmp_name(),employee.getEmp_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return swarthy;
	}

/**
 * @author 刘俊泽
 * 审批状态表
 */
	@Override
	public void UPdateElse(Status status) {
		// TODO Auto-generated method stub
		String sql = "UPDATE STATUS SET status1='审核通过',status2='审核中',status1_opinion=?,status1_time=? WHERE app_abb=?";
		QueryRunner runner = new QueryRunner();
		try {
			runner.update(DBUtil.getConnection(), sql, status.getStatus1_opinion(),status.getStatus1_time(),status.getApp_abb());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
/**
 * @author 刘俊泽
 * 驳回
 */
@Override
public void UPdateboh(Status status) {
	// TODO Auto-generated method stub
	String sql = "UPDATE STATUS SET status1='未通过',status_result='未通过',status1_opinion=?,status1_time=? WHERE app_abb=?";
	QueryRunner runner = new QueryRunner();
	try {
		runner.update(DBUtil.getConnection(), sql,status.getStatus1_opinion(),status.getStatus1_time(), status.getApp_abb());
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.close(conn, pre, rs);
	}
}
	

}