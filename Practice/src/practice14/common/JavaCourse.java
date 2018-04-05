package practice14.common;

public class JavaCourse implements Course {


	public String getCourseName() {
		return PREFIX + "Java";
	}

	public String[] getCourseUnit(){
		return new String[] {
				"式と計算",
				"制御構文",
				"メソッド",
				"配列",
				"オブジェクト指向",
				"継承",
				"高度な継承"
		};
	}
}