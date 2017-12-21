package pack;

class ConvCal {
	double met, fot, inch;

	public void fromMeters(double met) {
		this.fot = (3.28084) * met;
		this.inch = (39.37008) * met;
		System.out.println("Foot is " + fot + "\n Inch is " + inch);
	}

	public void fromfoot(double fot) {
		this.met = (0.3048) * fot;
		this.inch = (12) * fot;
		System.out.println("Metere is " + met + "\n Inch is " + inch);

	}

	public void frominch(double inch) {
		this.fot = (0.0833333) * inch;
		this.met = (0.0254) * inch;
		System.out.println("Foot is " + fot + "\n Meter is " + met);
	}
}