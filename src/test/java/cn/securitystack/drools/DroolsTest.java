package cn.securitystack.drools;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.School;
import com.sample.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring.xml" })
public class DroolsTest {

	@KSession("kieSession")
//	@KReleaseId( groupId = "com.sampleter", artifactId = "securitystack.example", version = "LATEST")
	private KieSession kieSession;

	/*
	 * @Autowired private KieBase kieBase;
	 */


	public void TestMap() {
		/* KieSession kieSession = kieBase.newKieSession(); */
		School school = new School();
		school.setAddr("南京建邺江东路");
		school.setName("南京五中");
		Student student = new Student();
		student.setName("大王");
		student.setAge(10);
		student.setSex("f");
		student.setSchool(school);
		Map<String, School> map = new HashMap<String, School>();
		map.put("middle", school);

		/*
		 * for( Entry<String, School> entry:map.entrySet()){ String key =
		 * entry.getKey(); System.out.println("key :"+key); School school2 =
		 * entry.getValue();
		 * System.out.println("name :"+school2.getName()+"   地址为  :"
		 * +school2.getAddr()); }
		 */
		/*
		 * Iterator iterator = factMap.entrySet().iterator();
		 * System.out.println(iterator); System.out.println("----------------");
		 * while (iterator.hasNext()) { Entry entry = (Entry) iterator.next();
		 * System.out.println(entry.getKey()); School school =
		 * (School)entry.getValue(); System.out.println(school.getName());
		 * System.out.println(school.getAddr()); }
		 */

		map.put("middle", school);
		student.setMap(map);
		kieSession.insert(student);
		int count = kieSession.fireAllRules();
		System.out.println("共执行了  ：" + count + "次");
		System.out.println(student.getName());

	}

	@Test
	public void TestList(){
/*        Student student = new Student();
        student.setName("大王111");
        student.setAge(10);
        student.setSex("f");
        Student student1 = new Student();
        student1.setName("大王2222");
        student1.setAge(20);
        student1.setSex("m");
        Student student2 = new Student();
        student2.setName("大王3333");
        student2.setAge(30);
        student2.setSex("f");
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
       
        Student student3 = new Student();
        student2.setName("大王3333");
        student2.setAge(30);
        student2.setSex("f");
        
        kieSession.insert(student3);
        kieSession.setGlobal("studentList", list);
*/        
		System.out.println("-----------------------9999-------------------------------------");
//		System.out.println("id:"+Thread.currentThread().getId()+"---------name:"+Thread.currentThread().getName());
		//kieSession.getAgenda().getAgendaGroup("test01").setFocus();
		//System.out.println("-----------------------1010-------------------------------------");
		//kieSession.getAgenda().getAgendaGroup("test02").setFocus();
		int count =  kieSession.fireAllRules();
        System.out.println("执行了几次 ："+count);
      
	}
}
