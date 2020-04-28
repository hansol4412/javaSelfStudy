package chap08;

public class CheckBoxExample1 {

	public static void main(String[] args) {
		// 익명객체
		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
					
					@Override
					public void onSelect() {
						System.out.println("배경을 변경합니다.");
						
					}
				});
		
		
		checkBox.select();
	}

}
