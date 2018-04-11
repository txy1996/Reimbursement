package com.zlt.system.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zlt.system.dao.OtherDao;
import com.zlt.system.dao.impl.OtherDaoImpl;
import com.zlt.system.service.HistoryRecordService;
import com.zlt.system.vo.History;

public class HistoryRecordServiceImpl implements HistoryRecordService {
	private OtherDao otherDao = new OtherDaoImpl();
	private List<History> list;

	/**
	 * 测试方法
	 * 
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		HistoryRecordServiceImpl ser = new HistoryRecordServiceImpl();
		List<History> list;
		list = ser.findLike("QT", "3");
		System.out.println(list);
	}

	@Override
	public List<History> findDefault(String userName) throws SQLException {
		otherDao.currentUser(userName);
		list = otherDao.findByDate("3");
		return list;
	}

	@Override
	public List<History> findLike(String string, String thismon) throws SQLException {
		list = otherDao.findLike(string, thismon);
		return list;
	}

	@Override
	public List<History> findByDate(String thisTime) throws SQLException {
		list = otherDao.findByDate(thisTime);
		return list;
	}

	@Override
	public List<History> replace() {
		Collections.reverse(list);
		return list;
	}
	@Override
	public Object[] pagingBar(int page) {
		// 找出当前页需要的数据
		List<History> minList = new ArrayList<History>();
		for (int i = (page - 1) * 10; i < (page * 10) && i < list.size(); i++) {
			minList.add(list.get(i));
		}
		// 生成一个导航条字段
		StringBuffer bar = new StringBuffer();
		if (page > 1) {
			bar.append("<a href='HistoryRecordServlet?page=" + (page - 1) + "'>上一页</a>");
		}
		if (page < (page - 1) * 10) {
			bar.append("<a href='HistoryRecordServlet?page=" + (page + 1) + "'>下一页</a>");
		}
		Object[] object = { minList, bar };
		return object;
	}
}
