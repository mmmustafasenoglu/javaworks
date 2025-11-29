package proje4;

import java.util.Date;

public class ucus {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getKalkıs() {
		return kalkıs;
	}
	public void setKalkıs(Date kalkıs) {
		this.kalkıs = kalkıs;
	}
	public Date getIniş() {
		return iniş;
	}
	public void setIniş(Date iniş) {
		this.iniş = iniş;
	}
	public ucak getUcak() {
		return ucak;
	}
	public void setUcak(ucak ucak) {
		this.ucak = ucak;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	public Pilot getYardımcı() {
		return yardımcı;
	}
	public void setYardımcı(Pilot yardımcı) {
		this.yardımcı = yardımcı;
	}
	public Airlenescompanies getKy() {
		return ky;
	}
	public void setKy(Airlenescompanies ky) {
		this.ky = ky;
	}
	public Airlenescompanies getIy() {
		return iy;
	}
	public void setIy(Airlenescompanies iy) {
		this.iy = iy;
	}
	Date kalkıs;
	Date iniş;
	ucak ucak;
	Pilot pilot;
	Pilot yardımcı;
	Airlenescompanies ky;
	Airlenescompanies iy;
	public ucus(int id, Date kalkıs, Date iniş, ucak ucak, Pilot pilot, Pilot yardımcı) {
		this.id = id;
		this.kalkıs = kalkıs;
		this.iniş = iniş;
		this.ucak = ucak;
		this.pilot = pilot;
		this.yardımcı = yardımcı;
	}
	
	
	
	

}
