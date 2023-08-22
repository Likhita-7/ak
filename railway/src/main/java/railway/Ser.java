package railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Ser {
	Connection con;
	ResultSet rs;
	public void meth() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "pff123");
		System.out.println("connection created");
		
	}
	public JSONArray meth1() throws SQLException, JSONException {
		PreparedStatement st=con.prepareStatement("select trn_start from train_data");
		rs=st.executeQuery();
		System.out.println(rs);
		JSONArray js=new JSONArray();
		
		while(rs.next()) {
			JSONObject ob=new JSONObject();
			ob.put("st", rs.getString(1));
			js.put(ob);
			
		}
		return js;
		
		}
	public JSONArray meth2(String v1,String v2) throws SQLException, JSONException {
		PreparedStatement st=con.prepareStatement("select trn_name from train_data where trn_start=? and trn_end=?");
		st.setString(1,v1);
		st.setString(2,v2);
		
		rs=st.executeQuery();
		System.out.println(rs);
		JSONArray js=new JSONArray();
		
		while(rs.next()) {
			JSONObject ob=new JSONObject();
			ob.put("st", rs.getString(1));
			js.put(ob);
			
		}
		return js;
		
		}
	public Ticket meth3(String from,String to,String tlist,String clas,String[] na,String[] ag, String[] ge) {
		ArrayList<Passenger> ps=new ArrayList<>();
		for(int i=0;i<na.length;i++) {
			Passenger p=new Passenger(na[i],Integer.parseInt(ag[i]),ge[i]);
			System.out.println(p);
			ps.add(p);
		
		}
		Ticket t= new Ticket(tlist,from,to,clas);
		t.setTl(ps);
		
		return t;
		
		
	}
	public  void meth4() {
		//Ticket t=meth3();
	}
}
