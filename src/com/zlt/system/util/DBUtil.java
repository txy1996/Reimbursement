package com.zlt.system.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
private static ComboPooledDataSource dataSource = null;
	
	static{
		dataSource = new ComboPooledDataSource();
	}
	public static QueryRunner getQueryRunner(){
		return new QueryRunner(dataSource);
	}
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	public static void close(Connection conn,PreparedStatement pre,ResultSet rs){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pre!=null){
			try {
				pre.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
