package coloreo;

import java.util.Arrays;

public class Coloring {
	private int colors;
	private Integer[] colorAssignament;
	
	public Coloring(int colors, Integer[] colorAssignament) {
		this.colors=colors;
		this.colorAssignament=colorAssignament;
	}

	public int getColors() {
		return colors;
	}

	public void setColors(int colors) {
		this.colors = colors;
	}

	public Integer[] getColorAssignament() {
		return colorAssignament;
	}

	public void setColorAssignament(Integer[] colorAssignament) {
		this.colorAssignament = colorAssignament;
	}

	@Override
	public String toString() {
		String toString = "Coloring [colors="+colors+", ";
		for(int i=0;i<colorAssignament.length;i++) {
			toString+=System.lineSeparator() + " [" + i + ", " + colorAssignament[i] + "]";
		}
		return toString;
	}
	

}