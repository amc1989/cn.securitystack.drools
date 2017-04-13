package cn.securitystack.drools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.securitystack.drools.demo.School;

import com.google.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring.xml" })
public class AutoScanDrools {
	
	@Inject
	@KSession("defaultKieSession")
	@KReleaseId(groupId = "cn.securitystack.drools", artifactId = "demo", version = "1.1.1")
	private KieSession kSession;

	@Test
	public void runRules() {
		while (true) {
				System.out.println("start ...");
				School school = new School();
				school.setAddr("南京");
				school.setName("lily");
				kSession.insert(school);  
				int i=kSession.fireAllRules();  
				System.out.println("共执行了"+i+"条规则");  
				System.out.println("修改后的结果"+school.getAddr());  
				System.out.println("修改后的结果"+school.getName());  
		}
	}
	
	
}
