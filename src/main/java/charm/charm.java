package charm;

public class charm {
	public int face;
	public int rich;
	public int nature;
	public int smile;
	public int speech;
	
	public charm() {
		
	}
	public boolean isCondition(int number) {
		// TODO Auto-generated method stub
		if(number >= 0 && number <= 10) {
			return true;
		}
		return false;
	}
	
	public int getFace() {
		return face;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public int getRich() {
		return rich;
	}
	public void setRich(int rich) {
		this.rich = rich;
	}
	public int getNature() {
		return nature;
	}
	public void setNature(int nature) {
		this.nature = nature;
	}
	public int getSmile() {
		return smile;
	}
	public void setSmile(int smile) {
		this.smile = smile;
	}
	public int getSpeech() {
		return speech;
	}
	public void setSpeech(int speech) {
		this.speech = speech;
	}
	
	public double process() {
		double result =this.face*2.222+this.rich*1.111+this.nature*4.4+this.smile*2.22-this.speech*1.11;
		return result;
	}
	

}
