 package dmacc;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;

//import dmacc.beans.Event;
//import dmacc.beans.Performers;
//import dmacc.controller.BeanConfiguration;
//import dmacc.repository.EventRepository;

@SpringBootApplication
public class AssessmentMod10Application{

	public static void main(String[] args) {
		SpringApplication.run(AssessmentMod10Application.class, args);
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Event c = appContext.getBean("event", Event.class);
		//System.out.println(c.toString());
	}
/*  @Autowired
	EventRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	ApplicationContext appContext = new
	AnnotationConfigApplicationContext(BeanConfiguration.class);
	//Using an existing bean
	Event c = appContext.getBean("event", Event.class);
	c.setType("Music Concert");
	repo.save(c);
	//Creating a bean to use – not managed by Spring
	Event d = new Event("Music Concert", "1/1/2024", 500);
	Performers a = new Performers("Selena Gomez", "Female", "Pineapple");
			d.setPerformer(a);
			repo.save(d);
			List<Event> allMyContacts = repo.findAll();
			for(Event people: allMyContacts) {
			System.out.println(people.toString());
			}
			((AbstractApplicationContext) appContext).close();
			}
*/}
