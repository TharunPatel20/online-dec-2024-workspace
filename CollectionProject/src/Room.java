import java.util.Objects;

public class Room {
	private int length;
	private int width;
	private int height;
	
	public Room() {}

	public Room(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return height == other.height && length == other.length && width == other.width;
	}

	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
}
