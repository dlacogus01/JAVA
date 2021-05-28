package concept;

public class Basic {
	private int height;
	private int width;
	private String name;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int add(int height, int width) {
		return height * width;
		
	}
	
	public String toString() {
		return "사각형 높이 : " + height + ", 너비 : " + width;
	} 
	
	

}
