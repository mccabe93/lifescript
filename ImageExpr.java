// implementation of rhsvar expression

public class ImageExpr extends AST {

	private String img;

	public ImageExpr(String img) {
		this.img = img;
	}

	public String img() {
		return img;
	}
}
