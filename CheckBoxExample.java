package chap08;

public class CheckBoxExample {

	public static void main(String[] args) {
		// 중첩인터페이스
		CheckBox checkbox = new CheckBox();
		checkbox.setOnSelectListener(new BackgroundChangeListener());
		checkbox.select();
		

	}

}
