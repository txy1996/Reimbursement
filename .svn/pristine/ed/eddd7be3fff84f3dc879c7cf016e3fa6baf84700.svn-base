package com.zlt.system.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zlt.system.dao.OtherDao;
import com.zlt.system.entity.Other;
import com.zlt.system.util.DBUtil;
import com.zlt.system.vo.History;
import com.zlt.system.vo.OtherInfoVo;

/**
 * 其他类型报销信息的实现类
 * 
 * @author 米邓勇
 *
 */
public class OtherDaoImpl extends CurrencyDaoImpl<Other> implements OtherDao {
	private Connection conn;
	private PreparedStatement psat;
	private ResultSet rst;
	private String userName;

	@Override
	public void currentUser(String userName) {
		this.userName=userName;
	}
	
	
	@Override
	public List<History> findLike(String string,String thismon) throws SQLException {
		// 查询语句
		String sql1 = "SELECT emp.emp_name,other_time,other_title,other_money,other_reason,other_remarks,department.department_name,reim_type,other.app_abb FROM emp,other,department,posi,reimtypetab WHERE emp.emp_name=other.emp_name AND posi.position_id=emp.post_id AND department.department_id=posi.department_id AND reimtypetab.reim_id=other.reim_id AND emp.emp_name=? AND ( other_money like BINARY ? or other_time like BINARY ? or other_title like BINARY ? or other_reason like BINARY ? or other_remarks like BINARY ? or department.department_name like BINARY ? or other.app_abb like BINARY ? or reim_type like BINARY ?) AND other_time>DATE_SUB(CURDATE(), INTERVAL ? MONTH) ORDER BY other_time";
		string = "%" + string + "%";
		String[] str = { userName, string,string, string, string, string, string, string,string,thismon};
		return findBySql(sql1, str);
	}

	@Override
	public List<History> findByDate(String thisTime) throws SQLException {
		// 查询语句
		String sql = "SELECT emp.emp_name,other_time,other_title,other_money,other_reason,other_remarks,department.department_name,reim_type,other.app_abb FROM emp,other,department,posi,reimtypetab    WHERE emp.emp_name=other.emp_name AND posi.position_id=emp.post_id AND department.department_id=posi.department_id AND reimtypetab.reim_id=other.reim_id AND emp.emp_name=? AND other_time>DATE_SUB(CURDATE(), INTERVAL ? MONTH) ORDER BY other_time";
		String[] str = {userName,thisTime };
		return findBySql(sql,str);
	}

	/**
	 * 封装用于历史记录查询方法
	 * 
	 * @param 对应条件的查询语句sql
	 * @param 判断正序倒序排序的参数flag
	 * @param 拼接sql
	 *            语句的字符串组
	 * @return 符合查询条件的历史记录集合
	 * @throws SQLException
	 */
	private List<History> findBySql(String sql, String[] string) throws SQLException {
		conn = DBUtil.getConnection();
		psat = conn.prepareStatement(sql);
		for (int i = 1; i <= string.length; i++) {
			psat.setString(i, string[i - 1]);
		}
		rst = psat.executeQuery();
		List<History> list = new ArrayList<History>();
		// 处理结果集
		while (rst.next()) {
			History history = new History();
			history.setApp_abb(rst.getString("app_abb"));
			history.setDepartment_name(rst.getString("department_name"));
			history.setEmp_name(rst.getString("emp_name"));
			history.setOther_money(rst.getInt("other_money"));
			history.setOther_title(rst.getString("other_title"));
			history.setOther_reason(rst.getString("other_reason"));
			history.setOther_time(rst.getString("other_time"));
			history.setReimbursementtype_type(rst.getString("reim_type"));
			history.setRemarks(rst.getString("other_remarks"));
			list.add(history);
		}
		// 关闭连接资源
		DBUtil.close(conn, psat, rst);
		return list;
	}

	/**
	 * @author 任义平 用于报销类型详情查询
	 */
	@Override
	public OtherInfoVo FindByType(String app_abb) {
		// TODO Auto-generated method stub

		String sql = "SELECT other_title,other_time,other_reason,other_remarks,other_money,status1_opinion\r\n" + 
				"FROM other,reimtypetab,STATUS\r\n" + 
				"WHERE reimtypetab.`reim_id`=other.`reim_id` AND status.`app_abb`=other.app_abb AND other.app_abb=?";
		QueryRunner runner = new QueryRunner();
		OtherInfoVo other = null;
		try {
			other = runner.query(DBUtil.getConnection(), sql, new BeanHandler<OtherInfoVo>(OtherInfoVo.class), app_abb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pre, rs);
		}
		return other;
	}
/**
 * @author 刘俊泽
 * 其他类型查询
 */
@Override
public OtherInfoVo FinByElse(String app_abb) {
	// TODO Auto-generated method stub
	String sql = "SELECT other_title,other_time,other_reason,other_remarks,other_money,status1_opinion\r\n"
				+ "FROM other,reimtypetab,STATUS\r\n"
				+ "WHERE reimtypetab.`reim_id`=other.`reim_id` AND status.`app_abb`=other.app_abb=?";
	QueryRunner runner=new QueryRunner();
	OtherInfoVo other1=null;
	try {
		other1 = runner.query(DBUtil.getConnection(), sql, new BeanHandler<OtherInfoVo>(OtherInfoVo.class), app_abb);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return other1;
}
}
