package ezen.student.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import ezen.student.dto.EMSInformationService;

public class MainClass {

	public static void main(String[] args) {
		
		
		String[] sNums = {"H39asdfaelu42o23", "H39iiemamca8w9h4", "H39lkmn754fghia7", "H39plo865cuy8k92",
				"H39mnbviiae89q1", "H399omjjyv56t3d5", "H39lczaqwgwg44gj8","H39ymbscsh74thgh2", "H39lesvj7544vf89"};
		
		String[] sIds = {"hippo", "raccon", "elephant", "lion", "tiger", "pig", "horse", "bird", "deer"};
		
		String[] sPws = {"94875", "15284", "48765", "28661", "60915", "30028", "29801", "28645", "28465" };
		
		String[] sNames = {"barbara", "chris", "doris", "elva", "fiona", "holly", "jasmin", "lena", "melissa"};
		
		int[] sAges = {22, 20, 27, 19, 21, 19, 25, 22, 24};
		
		String[] sGenders = {"W", "W", "M", "M", "M", "W", "M", "W", "W"};
		
		String[] sMajors = {"Korean Literature", "French Literature", "Philosophy", "History", "Law", "Stastics"
				,"Computer", "Economics", "Public admin"};
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		/*
		InsertService is = ctx.getBean("insertService", InsertService.class);
		
		for(int i=0; i<sNums.length; i++) {
			Student std = new Student(sNums[i], sIds[i], sPws[i], sNames[i], sAges[i], sGenders[i], sMajors[i]);
			is.insertStudent(std);
		}
		
		
		SelectAllService sas = ctx.getBean("selectAllService", SelectAllService.class);
		//모든 학생 조회
		ArrayList<Student> list = sas.selectAllStudent();
		for(int j=0; j<list.size(); j++) {
		//System.out.print("| sNum : " + list.get(j).getsNum() + "\t");
		System.out.print("| sId : " + list.get(j).getsId() + "\t");
		//System.out.print("| sPw : " + list.get(j).getsPw() + "\t");
		System.out.print("| sName : " + list.get(j).getsName() + "\n");
		//System.out.print("| sAge : " + list.get(j).getsAge() + "\t");
		//System.out.print("| sGender : " + list.get(j).getsGender() + "\t");
		//System.out.print("| sMajor : " + list.get(j).getsMajor() + "\n");
		}
		Scanner sc = new Scanner(System.in);
		System.out.printf("조회할 학생의 아이디를 입력하세요:");
		String id = sc.nextLine();
		
		SelectOneService sos = ctx.getBean("selectOneService", SelectOneService.class);
		Student std = sos.selectOneStudent(id);
		
		System.out.print("sNum : " + std.getsNum() + "\n");
		System.out.print("| sId : " + std.getsId() + "\n");
		System.out.print("| sPw : " + std.getsPw() + "\n");
		System.out.print("| sName : " + std.getsName() + "\n");
		System.out.print("| sAge : " + std.getsAge() + "\n");
		System.out.print("| sGender : " + std.getsGender() + "\n");
		System.out.print("| sMajor : " + std.getsMajor() + "\n\n");
		
		System.out.println("수정할 학생의 아이디를 입력하세요:");
		id = sc.nextLine();
		std = sos.selectOneStudent(id);
		if(std==null) {
			System.out.println("조회한 아이디의 학생이 없습니다");
			return;
		}
		
		System.out.printf("기존 비밀번호 : %s - 수정할 비밀번호를 입력하세요: ", std.getsPw());
		String pw = sc.nextLine();
		if( !pw.equals("")) {
			std.setsPw(pw);
		}
		System.out.printf("기존 성명 : %s - 수정할 성명을 입력하세요: ", std.getsName());
		String name = sc.nextLine();
		if( !name.equals("")) {
			std.setsName(name);
		}
		System.out.printf("기존 나이 : %d - 수정할 나이를 입력하세요: ", std.getsAge());
		String age = sc.nextLine();
		if( !age.equals("")) {
			std.setsAge(Integer.parseInt(age));
		}
		System.out.printf("기존 성별 : %s - 수정할 성별을 입력하세요: ", std.getsGender());
		String gender = sc.nextLine();
		if( !pw.equals("")) {
			std.setsGender(gender);
		}
		System.out.printf("기존 전공 : %s - 수정할 전공을 입력하세요: ", std.getsMajor());
		String major = sc.nextLine();
		if( !major.equals("")) {
			std.setsMajor(major);
		}
		
		UpdateService us = ctx.getBean("updateService", UpdateService.class);
		us.updateStudent(std);
		
		System.out.println("아래와 같이 수정되었습니다");
		Student ustd = sos.selectOneStudent(id);
		
		System.out.print("sNum : " + ustd.getsNum() + "\n");
		System.out.print("| sId : " + ustd.getsId() + "\n");
		System.out.print("| sPw : " + ustd.getsPw() + "\n");
		System.out.print("| sName : " + ustd.getsName() + "\n");
		System.out.print("| sAge : " + ustd.getsAge() + "\n");
		System.out.print("| sGender : " + ustd.getsGender() + "\n");
		System.out.print("| sMajor : " + ustd.getsMajor() + "\n\n");
		*/
		EMSInformationService eis = ctx.getBean("informationService", EMSInformationService.class);
		eis.outputEMSInformation();
		
	}
}