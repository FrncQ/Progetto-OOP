package Model;

import java.util.Objects;

public class Organizzatore {
	
	private String id;
	private String name;
	private String image_id;
	private String vertical;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}
	@Override
	public String toString() {
		return "Organization [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (image_id != null ? "image_id=" + image_id + ", " : "")
				+ (vertical != null ? "vertical=" + vertical : "") + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, image_id, name, vertical);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organizzatore other = (Organizzatore) obj;
		return Objects.equals(id, other.id) && Objects.equals(image_id, other.image_id)
				&& Objects.equals(name, other.name) && Objects.equals(vertical, other.vertical);
	}
}

	