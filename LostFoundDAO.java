package lostfoundsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LostFoundDAO {
	   public void reportLostItem(String name, String location, Date date) {
	        String sql = "INSERT INTO lost_items(item_name, location, lost_date) VALUES (?, ?, ?)";

	        try (Connection con = DBConnection.getConnection()) {
	            if (con == null) return;

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, name);
	            ps.setString(2, location);
	            ps.setDate(3, date);
	            ps.executeUpdate();

	            System.out.println("Lost item reported successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void reportFoundItem(String name, String location, Date date) {
	        String sql = "INSERT INTO found_items(item_name, location, found_date) VALUES (?, ?, ?)";

	        try (Connection con = DBConnection.getConnection()) {
	            if (con == null) return;

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, name);
	            ps.setString(2, location);
	            ps.setDate(3, date);
	            ps.executeUpdate();

	            System.out.println("Found item reported successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void viewLostItems() {
	        String sql = "SELECT * FROM lost_items";

	        try (Connection con = DBConnection.getConnection()) {
	            if (con == null) return;

	            ResultSet rs = con.createStatement().executeQuery(sql);
	            System.out.println("\nID | Item Name | Location | Lost Date");

	            while (rs.next()) {
	                System.out.println(
	                    rs.getInt("id") + " | " +
	                    rs.getString("item_name") + " | " +
	                    rs.getString("location") + " | " +
	                    rs.getDate("lost_date")
	                );
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void viewFoundItems() {
	        String sql = "SELECT * FROM found_items";

	        try (Connection con = DBConnection.getConnection()) {
	            if (con == null) return;

	            ResultSet rs = con.createStatement().executeQuery(sql);
	            System.out.println("\nID | Item Name | Location | Found Date");

	            while (rs.next()) {
	                System.out.println(
	                    rs.getInt("id") + " | " +
	                    rs.getString("item_name") + " | " +
	                    rs.getString("location") + " | " +
	                    rs.getDate("found_date")
	                );
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
