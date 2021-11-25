package coloreo;
import java.util.ArrayList;
import java.util.List;

public class ColoringFirstColor implements ColoringMethod {
	
	@Override
	public Coloring pain(Graph graph, Order order) {
		Integer[][] matrixGraph = graph.getMatrix();
		Integer[] nodoColor= new Integer[matrixGraph.length];
		
		List<Integer> colorTakes = new ArrayList<Integer>();
		int colors=0;
		
		for(int i=0;i< order.getOrder().size();i++) {
			for(int j=0; j< matrixGraph.length; j++) {
				if(j!=i && matrixGraph[order.getOrder().get(i)][j] !=null) {
					for(int k=0; k<colors;k++) {
						if(nodoColor[j] != null && nodoColor[j]==k) {
							colorTakes.add(k);
						}
					}
				}
			}
			
			int k;
			for(k=0; k<colors; k++) {
				if(!colorTakes.contains(k)) {
					nodoColor[order.getOrder().get(k)] = k;
					break;
				}
			}
			
			if(k==colors) {
				colors++;
				nodoColor[order.getOrder().get(i)] = colors;
			}
			colorTakes= new ArrayList<Integer>();
		}
		return new Coloring(colors,nodoColor);
	}

}