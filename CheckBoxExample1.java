package chap08;

public class CheckBoxExample1 {

	public static void main(String[] args) {
		// �͸�ü
		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
					
					@Override
					public void onSelect() {
						System.out.println("����� �����մϴ�.");
						
					}
				});
		
		
		checkBox.select();
	}

}
