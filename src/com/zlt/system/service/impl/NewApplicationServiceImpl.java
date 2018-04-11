package com.zlt.system.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zlt.system.dao.BillsDao;
import com.zlt.system.dao.HotelDao;
import com.zlt.system.dao.OtherDao;
import com.zlt.system.dao.ReimTypeTabDao;
import com.zlt.system.dao.ReimnumtabDao;
import com.zlt.system.dao.StatusDao;
import com.zlt.system.dao.TrafficDao;
import com.zlt.system.dao.TravelDao;
import com.zlt.system.dao.impl.BillsDaoImpl;
import com.zlt.system.dao.impl.HotelDaoImpl;
import com.zlt.system.dao.impl.OtherDaoImpl;
import com.zlt.system.dao.impl.ReimTypeTabDaoImpl;
import com.zlt.system.dao.impl.ReimnumtabDaoImpl;
import com.zlt.system.dao.impl.StatusDaoImpl;
import com.zlt.system.dao.impl.TrafficDaoImpl;
import com.zlt.system.dao.impl.TravelDaoImpl;
import com.zlt.system.entity.Bills;
import com.zlt.system.entity.Hotel;
import com.zlt.system.entity.Other;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.entity.Reimnumtab;
import com.zlt.system.entity.Status;
import com.zlt.system.entity.Traffic;
import com.zlt.system.entity.Travel;
import com.zlt.system.service.NewAppcationService;
import com.zlt.system.vo.GetMaxMoneyVo;
/**
 * 报销申请的实现类
 * @author 米邓勇
 * @下午9:40:29
 */
public class NewApplicationServiceImpl implements NewAppcationService{
	HotelDao hd = new HotelDaoImpl();
	TravelDao tvd =new TravelDaoImpl();
	TrafficDao tfd = new TrafficDaoImpl();
	OtherDao od = new OtherDaoImpl();
	BillsDao bills = new BillsDaoImpl();
	ReimnumtabDao rd = new ReimnumtabDaoImpl();
	ReimTypeTabDao rt = new ReimTypeTabDaoImpl();
	StatusDao sd = new StatusDaoImpl();
	public static void main(String[] args) {
		NewAppcationService na = new NewApplicationServiceImpl();
		Status status = new Status();
		status.setApp_abb("CL22");
		status.setStatus1("审核中");
		status.setStatus2("审核中");
		status.setStatus_result("审核中");
		boolean ss = na.addStatus(status);
		System.out.println(ss);
		
		
		
		 File root2=new File(".");//获得当前文件夹（即工程目录），结果D:\workspaceOfJavaEclipse\javaTest
	        //File root2=new File("..");//获得当前文件夹的父文件夹，结果D:\workspaceOfJavaEclipse
	        System.out.println(root2.toString());
	        
		 try {
			 System.out.println(root2.getCanonicalPath());
	            String rootDir2=root2.getCanonicalPath();
	            System.out.println("当前工程所在文件夹："+rootDir2+"\\image\\");
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
	
	/**
	 * 通过返回值判断数据是否插入成功
	 * @return boolean
	 * @param travel
	 */
	@Override
	public boolean add(Travel travel) {
		
		return tvd.insert_NoID(travel);
	}
	/**
	 * 通过返回值判断数据是否插入成功
	 * @return boolean
	 * @param traffic
	 */
	@Override
	public boolean add(Traffic traffic) {
		return tfd.insert_NoID(traffic);
	}
	/**
	 * 通过返回值判断数据是否插入成功
	 * @return boolean
	 * @param other
	 */
	@Override
	public boolean add(Other other) {
		return od.insert_NoID(other);
	}
	/**
	 * 通过返回值判断数据是否插入成功
	 * @return boolean
	 * @param hotel
	 */
	@Override
	public boolean add(Hotel hotel) {
		return hd.insert_NoID(hotel);
	}
	/**
	 * 通过返回值判断数据是否插入成功
	 * @return boolean
	 * @param rm
	 */
	@Override
	public boolean add(Reimnumtab rm) {
		return rd.insert_NoID(rm);
	}
	/**
	 * 通过id查询获取数据
	 * @return ReimTypeTab
	 * @param rt
	 */
	@Override
	public ReimTypeTab findrei(ReimTypeTab rt) {
		return this.rt.findById(rt.getReim_id());
	}
	/**
	 * 通过查询获取到最近添加的一条数据
	 * @return Travel
	 */
	@Override
	public Travel findMaxtravel() {
		// TODO Auto-generated method stub
		return tvd.findMaxId();
	}
	/**
	 * 通过查询获取到最近添加的一条数据
	 * @return Traffic
	 */
	@Override
	public Traffic findMaxtraffic() {
		// TODO Auto-generated method stub
		return tfd.findMaxId();
	}
	/**
	 * 通过查询获取到最近添加的一条数据
	 * @return Other
	 */
	@Override
	public Other findMaxother() {
		// TODO Auto-generated method stub
		return od.findMaxId();
	}
	/**
	 * 通过查询获取到最近添加的一条数据
	 * @return Hotel
	 */
	@Override
	public Hotel findMaxhotel() {
		// TODO Auto-generated method stub
		return hd.findMaxId();
	}
	@Override
	public boolean update(Travel travel) {
		// TODO Auto-generated method stub
		return tvd.updata_num(travel);
	}
	@Override
	public boolean update(Traffic traffic) {
		// TODO Auto-generated method stub
		return tfd.updata_num(traffic);
	}
	@Override
	public boolean update(Other other) {
		// TODO Auto-generated method stub
		return od.updata_num(other);
	}
	@Override
	public boolean update(Hotel hotel) {
		// TODO Auto-generated method stub
		return hd.updata_num(hotel);
	}
	@Override
	public boolean addImg(Bills bills) {
		return this.bills.insert_NoID(bills);
	}
	@Override
	public boolean addStatus(Status status) {
		return sd.insert_NoID(status);
	}
	@Override
	public GetMaxMoneyVo findMaxMoney(String name) {
		// TODO Auto-generated method stub
		return rd.findLevel(name);
	}


	

	

}
