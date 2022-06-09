package Assignment_3;

public interface Resizable {
	public double area();
	public double perimeter();
	
	public default void resize(Rectangle r, double x) {
	    r.setHeight(x * r.getHeight());
	    r.setWidth(x * r.getWidth());
	}

}
