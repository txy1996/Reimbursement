package com.zlt.system.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zlt.system.dao.HotelDao;
import com.zlt.system.entity.Employee;
import com.zlt.system.entity.Hotel;
import com.zlt.system.util.DBUtil;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.HotelInfoVo;
/**
 * 住宿报销表的实现类
 * @author 米邓勇
 *
 */
public class HotelDaoImpl extends CurrencyDaoImpl<Hotel> implements HotelDao{

	@Override
	public List<?> HotelFindById(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelInfoVo FindByType(String app_abb) {
		// TODO Auto-generated method stub
		String sql="SELECT hotel_site,hotel_first,hotel_finish,hotel_days,hotel_people,hotel_other,hotel_remarks,hotel_quarterage,status1_opinion \r\n" + 
				"FROM hotel,reimtypetab,STATUS \r\n" + 
				"WHERE reimtypetab.`reim_id`=hotel.`reim_id` AND  status.`app_abb`=hotel.`app_abb` AND hotel.`app_abb`=?";
		QueryRunner runner=new QueryRunner();
		HotelInfoVo hotel=null;
		try {
			hotel=runner.query(DBUtil.getConnection(), sql, new BeanHandler<HotelInfoVo>(HotelInfoVo.class),app_abb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pre, rs);
		}
		return hotel;
	}
///**
// * @author 刘俊泽
// * 住宿类型报销
// */
//	@Override
//	public Hotel FindByElse(String app_abb, String type) {
//		String sql="SELECT hotel_site,hotel_first,hotel_finish,hotel_days,hotel_people,hotel_other,hotel_remarks,hotel_quarterage\r\n" + 
//				"FROM hotel,reimtypetab\r\n" + 
//				"WHERE reimtypetab.`reim_id`=hotel.`reim_id` AND app_abb=? AND reim_type=?";
//		QueryRunner runner=new QueryRunner();
//		Hotel hotel=null;
//		try {
//			hotel=runner.query(DBUtil.getConnection(), sql, new BeanHandler<Hotel>(Hotel.class),app_abb,type);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// TODO Auto-generated method stub
//		return hotel;
//	}
/**
 * @author 刘俊泽
 * 查找报销类型
 */
@Override
public HotelInfoVo FindBytype(String app_abb) {
	// TODO Auto-generated method stub
		List<ApplyreimVo> t = null;
		String sql = "SELECT hotel_site,hotel_first,hotel_finish,hotel_days,hotel_people,hotel_other,hotel_remarks,hotel_quarterage,status1_opinion\r\n" + 
				"FROM hotel,reimtypetab,STATUS\r\n" + 
				"WHERE reimtypetab.`reim_id`=hotel.`reim_id` AND  status.`app_abb`=hotel.`app_abb`=?";
		QueryRunner runner=new QueryRunner();
		HotelInfoVo hotel=null;
		try {
			hotel=runner.query(DBUtil.getConnection(), sql, new BeanHandler<HotelInfoVo>(HotelInfoVo.class),app_abb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotel;
	
}

}
