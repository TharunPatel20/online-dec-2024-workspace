package generics;

public class BoxGenerics<T> {
	
	private T length;
	private T width;
	private T height;
	
	public BoxGenerics(T length, T width, T height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
}
