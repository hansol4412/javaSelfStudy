package chap08;

public class CheckBoxExample {

	public static void main(String[] args) {
		// ��ø�������̽�
		CheckBox checkbox = new CheckBox();
		checkbox.setOnSelectListener(new BackgroundChangeListener());
		checkbox.select();
		

	}

}
