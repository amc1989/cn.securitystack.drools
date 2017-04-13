package com.sample;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {

	public static final void main(String[] args) {  
        try {  
            // load up the knowledge base  
            //得到一个KieService   
            KieServices ks = KieServices.Factory.get();  
            //工作kieService加载默认路径下的kmodule.xml 得到kContainer场所  
            KieContainer kContainer = ks.getKieClasspathContainer();  
            //kContainer得到一个会话  
            KieSession kSession = kContainer.newKieSession("ksession-rules");  
  
            // go !  
           /* Message message = new Message();  

            message.setMessage("Hello World");  
            message.setStatus(Message.HELLO);  
            message.setAge(10);*/
            School school = new School();
            school.setAddr("南京建邺江东路");
            school.setName("南京五中");
            Map<String, School> map = new HashMap<String, School>();
            map.put("middle", school);
            Student student = new Student();
            student.setName("大王");
            student.setAge(10);
            student.setSex("f");
            student.setSchool(school);
            student.setMap(map);
            //将事实数据传入kSession中  
            kSession.insert(student);  
            //执行所有的规则  
            kSession.fireAllRules();  
        } catch (Throwable t) {  
            t.printStackTrace();  
        }  
    }  
}
